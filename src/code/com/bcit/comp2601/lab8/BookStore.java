/**
 * the following class represents the BookStore class wich stores classical novels and performs various methods
 *Streams and Filters
 *
 * @author : Percy Ratheko
 *
 * version 1.8
 */


package com.bcit.comp2601.lab8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookStore
{
    private final static int YEAR_WRITTEN;
    private final static int SECOND_MILLENNIUM;

    private final static int TITLE_CHARACTERS;


    static
    {
        YEAR_WRITTEN      = 1950;
        SECOND_MILLENNIUM = 2000;
        TITLE_CHARACTERS  = 15;
    }


    public static void main(String[] args)
    {
        final List<Novel> bookstore;
        bookstore = new ArrayList<>();


        bookstore.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        bookstore.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        bookstore.add(new Novel("American Pastoral", "Philip Roth", 1997));
        bookstore.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        bookstore.add(new Novel("Animal Farm", "George Orwell", 1946));
        bookstore.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        bookstore.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        bookstore.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        bookstore.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        bookstore.add(new Novel("Atonement", "Ian McEwan", 2002));
        bookstore.add(new Novel("Beloved", "Toni Morrison", 1987));
        bookstore.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        bookstore.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        bookstore.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        bookstore.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        bookstore.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        bookstore.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        bookstore.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        bookstore.add(new Novel("Catch-22", "Joseph Heller", 1961));
        bookstore.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        bookstore.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        bookstore.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        bookstore.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        bookstore.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        bookstore.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        bookstore.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        bookstore.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        bookstore.add(new Novel("A Death in the Family", "James Agee", 1958));
        bookstore.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        bookstore.add(new Novel("Deliverance", "James Dickey", 1970));
        bookstore.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        bookstore.add(new Novel("Falconer", "John Cheever", 1977));
        bookstore.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        bookstore.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        bookstore.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        bookstore.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        bookstore.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        bookstore.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        bookstore.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookstore.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        bookstore.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        bookstore.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        bookstore.add(new Novel("Herzog", "Saul Bellow", 1964));
        bookstore.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        bookstore.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        bookstore.add(new Novel("I, Claudius", "Robert Graves", 1934));
        bookstore.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        bookstore.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        bookstore.add(new Novel("Light in August", "William Faulkner", 1932));
        bookstore.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        bookstore.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        bookstore.add(new Novel("Lord of the Flies", "William Golding", 1954));
        bookstore.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        bookstore.add(new Novel("Loving", "Henry Green", 1945));
        bookstore.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        bookstore.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        bookstore.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        bookstore.add(new Novel("Money", "Martin Amis", 1984));
        bookstore.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        bookstore.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        bookstore.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        bookstore.add(new Novel("Native Son", "Richard Wright", 1940));
        bookstore.add(new Novel("Neuromancer", "William Gibson", 1984));
        bookstore.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        bookstore.add(new Novel("1984", "George Orwell", 1948));
        bookstore.add(new Novel("On the Road", "Jack Kerouac", 1957));
        bookstore.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        bookstore.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        bookstore.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        bookstore.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        bookstore.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        bookstore.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        bookstore.add(new Novel("Possession", "A.S. Byatt", 1990));
        bookstore.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        bookstore.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        bookstore.add(new Novel("Rabbit, Run", "John Updike", 1960));
        bookstore.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        bookstore.add(new Novel("The Recognitions", "William Gaddis", 1955));
        bookstore.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        bookstore.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        bookstore.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        bookstore.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        bookstore.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        bookstore.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        bookstore.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        bookstore.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        bookstore.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        bookstore.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        bookstore.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        bookstore.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        bookstore.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        bookstore.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        bookstore.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        bookstore.add(new Novel("Ubik", "Philip K. Dick", 1969));
        bookstore.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        bookstore.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        bookstore.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        bookstore.add(new Novel("White Noise", "Don DeLillo", 1985));
        bookstore.add(new Novel("White Teeth", "Zadie Smith", 2000));
        bookstore.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));


        System.out.println("All Titles in UPPERCASE:");
        List<String> titlesUppercase = bookstore.stream()
                        .filter(q -> q != null && q.getTitle() != null && !q.getTitle().isBlank())
                .map(n -> n.getTitle().toUpperCase()).
                toList();

        titlesUppercase.forEach(System.out::println);


        System.out.println("\nBook Titles Containing 'the':");
        List<String> titlesContainingThe = bookstore.stream().
                filter(q -> q != null && q.getTitle() != null && !q.getTitle().isBlank()).
                map(Novel::getTitle).
                filter(title -> title.toLowerCase().contains("the")).
                toList();

        titlesContainingThe.forEach(System.out::println);


        System.out.println("\nAll Titles in Alphabetical Order:");
        List<String> alphabetOrder = bookstore.stream().
                filter(q -> q != null && q.getTitle() != null && !q.getTitle().isBlank()).
                map(Novel::getTitle).
                sorted(Comparator.comparing(String::toLowerCase)).
                toList();

        alphabetOrder.forEach(System.out::println);


        System.out.println("\nBooks from the 2000s:");
        List<String> booksfrom2000s = bookstore.stream().filter(Objects::nonNull).
                filter(n-> n.getYearPublished() >= SECOND_MILLENNIUM).
                map(Novel::getTitle).
                toList();

        booksfrom2000s.forEach(System.out::println);


        System.out.println("\nLongest Book Title:");
        Optional<String> longestTitle = bookstore.stream().
                filter(q -> q != null && q.getTitle() != null && !q.getTitle().isBlank()).
                map(Novel::getTitle)
                .max(Comparator.comparing(String::length));

        longestTitle.ifPresent(System.out::println);


        System.out.println("\nIs there a book written in 1950?");

        final boolean writtenIn1950 = bookstore.stream().filter(Objects::nonNull).
                anyMatch(p-> p.getYearPublished() == YEAR_WRITTEN);
        System.out.println(writtenIn1950);


        System.out.println("\nHow many books contain 'heart'?");

        System.out.println(bookstore.stream().filter(q -> q != null && q.getTitle() != null && !q.getTitle().isBlank() && q.getTitle().toLowerCase().contains("heart")).count());

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println();


        System.out.println("\nOldest book:");
        Optional<Novel> oldestBook = bookstore.stream().
                filter(p-> p != null).
                min(Comparator.comparingInt(Novel::getYearPublished));

        oldestBook.ifPresent(System.out::println);


        System.out.println("\nBooks with titles 15 characters long:");
        final Stream<String> titles15LongChar = bookstore.stream().
                filter(p-> p != null && p.getTitle() != null && !p.getTitle().isBlank() && p.getTitle().length() == TITLE_CHARACTERS).
                map(Novel::getTitle);

        titles15LongChar.forEach(System.out::println);



    }
}

