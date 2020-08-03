package claire.master;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Cry", 4.6);
        album.addSong("Deep blue", 4.2);
        album.addSong("A Thousand Year", 3.6);
        album.addSong("Baby", 3.62);
        album.addSong("Hold on", 4.71);
        album.addSong("Holy Man", 2.56);
        album.addSong("The gypsy", 4.38);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("I put the finger on you", 5.67);
        album.addSong("D.E.C", 5.62);
        album.addSong("Inject the venom", 3.6);
        album.addSong("Stranger thing", 3.90);
        album.addSong("Dead walking", 5.71);
        album.addSong("Breaking the rules", 3.56);
        album.addSong("The person of interest", 4.18);
        albums.add(album);

        List<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlayList("Hold on", playList);
        albums.get(1).addToPlayList("Dead walking", playList);
        albums.get(0).addToPlayList("They gypsy", playList);
        albums.get(0).addToPlayList("Speak king", playList);
        albums.get(0).addToPlayList(7, playList);
        albums.get(1).addToPlayList(6, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); // there is no track 24

        play(playList);
    }

    private static void play(List<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        if(playList.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        } else{
                            System.out.println("Where at the start of the list");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions");
    }

    private static void printList(List<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=====================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====================================");
    }
}
