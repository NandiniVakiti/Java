package lab4;

		public class CurrentAccount extends AccountAbstract {
			boolean flag=true;
			double bal = getBalance();
			double overdraftlimit=-1;
			public CurrentAccount(long accNum, double balance, Person accHolder) {
				super(accNum, balance, accHolder);
				// TODO Auto-generated constructor stub
			}

			@Override
			public void deposit(double amount) {
				
					bal+=amount;
			}

			@Override
			public void withdraw(double amount) {
				
				if(bal - amount<=overdraftlimit){
					System.out.println("Overdraft limit reached: amount cannot be withdrawn");
				}
				else
				{
					bal-=amount;
				}

			}
			public void getaccountBalance(){
				System.out.println(bal);
			}
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			/*@Override
			public String toString() {
				return "CurrentAccount [accNum=" + accNum + ", balance=" + balance
						+ ", accHolder=" + accHolder + "]";
			}*/
			
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			
			

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
		}


