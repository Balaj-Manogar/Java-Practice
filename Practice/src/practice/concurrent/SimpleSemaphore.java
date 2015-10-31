package practice.concurrent;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class SimpleSemaphore
{

	List<Integer> data = new ArrayList<Integer>()
	{
		{
			add(2);
			add(4);
			add(7);
		}
	};
	// Binary semaphore
	Semaphore semaphore = new Semaphore(1);

	public void addItem()
	{
		try
		{
			semaphore.acquire();
			System.out.println("[" + Thread.currentThread().getName() + "] acquired lock. size: " + data.size());
			for (int i = 0; i < 10; i++)
			{
				data.add(new Random().nextInt());
				Thread.sleep(300);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("[" + Thread.currentThread().getName() + "] ***INTERRUPTED***");
		}
		finally
		{
			System.out.println("[" + Thread.currentThread().getName() + "] **RELEASED** lock."); 
			semaphore.release();
		}
	}

	public void readItem() throws InterruptedException
	{
		try
		{
			semaphore.acquire();
			System.out.println("######################################");
			System.out.println("[" + Thread.currentThread().getName() + "] acquired lock. size: " + data.size());
			for (Integer i : data)
			{
				System.out.println("[" + Thread.currentThread().getName() + "] read i: " + i);
				$sleep(20);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("[" + Thread.currentThread().getName() + "] ***INTERRUPTED***");
		}
		finally
		{
			semaphore.release();
		}
	}

	static void $sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		final SimpleSemaphore h = new SimpleSemaphore();

		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					$sleep(100);
					h.readItem();
				}
				catch (InterruptedException e)
				{
					System.out.println("[" + Thread.currentThread().getName() + "] INTERRUPTED in THREAD");
				}

			}
		}, "READ_THREAD-1").start();

		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Thread.sleep(100);
					h.readItem();
				}
				catch (InterruptedException e)
				{
					System.out.println("[" + Thread.currentThread().getName() + "] INTERRUPTED in THREAD");
				}

			}
		}, "READ_THREAD-2").start();

		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				h.addItem();
			}
		}, "WRITE_THREAD-1").start();

		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				$sleep(500);
				h.addItem();
			}
		}, "WRITE_THREAD-2").start();

		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				$sleep(1000);
				h.addItem();
			}
		}, "WRITE_THREAD-3").start();
	}
}
