package com.synchronization;
class PrintTableSynchronizedBlock{    
    public void printTable(int n){
       synchronized(this){
    	   System.out.println("Table of " + n);
           for(int i=1;i<=10;i++){
               System.out.println(n*i);  
               try{  
            	 Thread.sleep(500);  
               }catch(Exception e){
            	 System.out.println(e);
               }  
            } 
       }            
    }  
}  
 
class MyThread1 extends Thread{  
	PrintTableSynchronizedBlock pt;  
    MyThread1(PrintTableSynchronizedBlock pt){  
    	this.pt=pt;  
    }  
    public void run(){ 
    	pt.printTable(2);  
    }        
}  
 
class MyThread2 extends Thread{  
	PrintTableSynchronizedBlock pt;  
	MyThread2(PrintTableSynchronizedBlock pt){  
		this.pt=pt;  
	}  
	public void run(){  
		pt.printTable(5);  
	}  
}  
 
public class SynchronizedBlockMultiThreadExample{  
    public static void main(String args[]){
    	//creating PrintTableSynchronizedBlock object.
    	PrintTableSynchronizedBlock obj = new PrintTableSynchronizedBlock();  
 
    	//creating threads.
	    MyThread1 t1=new MyThread1(obj);  
	    MyThread2 t2=new MyThread2(obj);  
 
	    //start threads.
	    t1.start();  
	    t2.start();  
    }  
}