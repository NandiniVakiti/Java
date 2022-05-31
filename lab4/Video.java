package lab4;

	class Video extends MediaItem {

		private String video_director;
		private String video_genre;
		private String video_year;
		/**
		 * @param idn
		 * @param title
		 * @param noOfCopies
		 * @param data
		 * @param video_director
		 * @param video_genre
		 * @param video_year
		 */
		public Video(int idn, String title, int noOfCopies, int data, String video_director, String video_genre,
				String video_year) {
			super(idn, title, noOfCopies, data);
			this.video_director = video_director;
			this.video_genre = video_genre;
			this.video_year = video_year;
		}
		
		public String getVideo_director() {
			return video_director;
		}

		public void setVideo_director(String video_director) {
			this.video_director = video_director;
		}

		public String getVideo_genre() {
			return video_genre;
		}

		public void setVideo_genre(String video_genre) {
			this.video_genre = video_genre;
		}

		public String getVideo_year() {
			return video_year;
		}

		public void setVideo_year(String video_year) {
			this.video_year = video_year;
		}

	}


