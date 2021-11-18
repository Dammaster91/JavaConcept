package com.synchronization;

class BankConsumer extends Thread {private BankAccount account;
public BankConsumer(BankAccount acct) {
    account = acct;
 }
 public void run() {
    for(int i = 0; i < 5; i++) {
       account.withdraw(10);
    }
 }}
