package lab4;

	class JournalPaper extends WrittenItem {
		private int yearpub;

		/**
		 * @param idn
		 * @param title
		 * @param noOfCopies
		 * @param author
		 * @param yearpub
		 */
		public JournalPaper(int idn, String title, int noOfCopies, String author, int yearpub) {
			super(idn, title, noOfCopies, author);
			this.yearpub = yearpub;
		}

		/**
		 * @return the yearpub
		 */
		public int getYearpub() {
			return yearpub;
		}

		/**
		 * @param yearpub
		 *            the yearpub to set
		 */
		public void setYearpub(int yearpub) {
			this.yearpub = yearpub;
		}

	}


