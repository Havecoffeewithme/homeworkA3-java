/**
 * the following class represents the Novel class with private instance variables and accessor methods.
 *
 * @author : Percy Ratheko
 *
 * version 1.8
 */

package com.bcit.comp2601.lab8;


public class Novel
{
    private final String title;

    private final String author;

    private final int yearPublished;

    /**
     *Constructor
     * @param title         : The title of the book
     * @param author        : The name of the author.
     * @param yearPublished : The year the book was published
     */
    public Novel(final String title,
                 final String author,
                 final int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the book.
     *
     * @return : returns the title of the book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the name of the author.
     *
     * @return : returns the name of the author.
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * gets the year published.
     *
     * @return : returns the year Published.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    @Override
    public String toString()
    {
        return "Novel{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }




}
