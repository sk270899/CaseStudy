package com.casestudy;

public class Client {
	
	abstract class Item {
		
		private int uniqueIdentificationNumber;
		private String title;
		private int noOfCopies;
		
		
		//----getters and setters----
		
		public int getUniqueIdentificationNumber() {
			return uniqueIdentificationNumber;
		}
		public void setUniqueIdentificationNumber(int uniqueIdentificationNumber) {
			this.uniqueIdentificationNumber = uniqueIdentificationNumber;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getNoOfCopies() {
			return noOfCopies;
		}
		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}
		
		//----toString----
		@Override
		public String toString() {
			return "Item [uniqueIdentificationNumber=" + uniqueIdentificationNumber + ", title=" + title + ", noOfCopies="
					+ noOfCopies + "]";
		}
		
	}

	abstract class WrittenItem extends Item {

		private String authorName;

		//----getter setter----
		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
	}

	class Book extends WrittenItem {
		
	}

	class JournalPaper extends WrittenItem {

		private int yearPublished;
	}

	abstract class MediaItem extends Item {
		
		private int runtime;

		//----getter and setters----
		public int getRuntime() {
			return runtime;
		}

		public void setRuntime(int runtime) {
			this.runtime = runtime;
		}

	}

	class Video extends MediaItem {
		private String director;
		private String genre;
		private int yearReleased;
		
	}

	class CD extends MediaItem {
		private String artist;
		private String genre;
	}

	public static void main(String[] args) {
		Client sahil = new Client();
		
		//----object creation----
		Book book1 = sahil.new Book();
		JournalPaper paper1 = sahil.new JournalPaper();
		Video video1 = sahil.new Video();
		CD cd1 = sahil.new CD();
		
		//----book1 values----
		book1.setAuthorName("Rudyard Kipling");
		book1.setUniqueIdentificationNumber(111);
		book1.setTitle("jungle book");
		book1.setNoOfCopies(1000);
		System.out.println("book 1 author : " + book1.getAuthorName());
		System.out.println(book1.toString());
		
		System.out.println("-------------------------------------------------------------------------------");
		
		//----paper1 values----
		paper1.setAuthorName("Ravish Kumar");
		paper1.yearPublished = 1999;
		paper1.setUniqueIdentificationNumber(121);
		paper1.setTitle("danik bhaskar");
		paper1.setNoOfCopies(100);
		System.out.println("journel 1 author : " + paper1.getAuthorName());
		System.out.println("year of publication : " + paper1.yearPublished);
		System.out.println(paper1.toString());
				
		System.out.println("-------------------------------------------------------------------------------");
		
		//----video1 values----
		video1.director = "Tseries";
		video1.genre = "rock";
		video1.yearReleased = 2010;
		video1.setRuntime(3);
		video1.setUniqueIdentificationNumber(131);
		video1.setTitle("its a song");
		video1.setNoOfCopies(1);
		System.out.println("Director of video 1 : " + video1.director);
		System.out.println("genre of video" + video1.genre);
		System.out.println("year of release of video : " + video1.yearReleased);
		System.out.println("Runtime : " + video1.getRuntime());
		System.out.println(video1.toString());
		
		System.out.println("-------------------------------------------------------------------------------");
		
		//----cd1 values----
		cd1.artist = "CD artist";
		cd1.genre = "CD genre";
		cd1.setRuntime(10);
		cd1.setUniqueIdentificationNumber(141);
		cd1.setTitle("CD Title");
		cd1.setNoOfCopies(18);
		System.out.println("Artist of CD 1 : " + cd1.artist);
		System.out.println("genre name : " + cd1.genre);
		System.out.println("Runtime : " + cd1.getRuntime());
		System.out.println(cd1.toString());
	}
}



//-------------------------------------OUTPUT------------------------------------

//book 1 author : Rudyard Kipling
//Item [uniqueIdentificationNumber=111, title=jungle book, noOfCopies=1000]
//-------------------------------------------------------------------------------
//journel 1 author : Ravish Kumar
//year of publication : 1999
//Item [uniqueIdentificationNumber=121, title=danik bhaskar, noOfCopies=100]
//-------------------------------------------------------------------------------
//Director of video 1 : Tseries
//genre of videorock
//year of release of video : 2010
//Runtime : 3
//Item [uniqueIdentificationNumber=131, title=its a song, noOfCopies=1]
//-------------------------------------------------------------------------------
//Artist of CD 1 : CD artist
//genre name : CD genre
//Runtime : 10
//Item [uniqueIdentificationNumber=141, title=CD Title, noOfCopies=18]





