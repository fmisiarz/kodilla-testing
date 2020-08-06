package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int IDN;
    private final String name;
    private final char gender;
    private final LocalDate DateOfBirth;
    private final int Posts;

    public ForumUser(int IDN, String name, char gender, int YearOfBirth,int MonthOfBirth,int DayOfBirth, int posts) {
        this.IDN = IDN;
        this.name = name;
        this.gender = gender;
        this.DateOfBirth = LocalDate.of(YearOfBirth,MonthOfBirth,DayOfBirth);
        Posts = posts;
    }

    public int getIDN() {
        return IDN;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public int getPosts() {
        return Posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IDN=" + IDN +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", DateOfBirth=" + DateOfBirth +
                ", Posts=" + Posts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (IDN != forumUser.IDN) return false;
        if (gender != forumUser.gender) return false;
        if (Posts != forumUser.Posts) return false;
        if (!name.equals(forumUser.name)) return false;
        return DateOfBirth.equals(forumUser.DateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = IDN;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) gender;
        result = 31 * result + DateOfBirth.hashCode();
        result = 31 * result + Posts;
        return result;
    }
}
