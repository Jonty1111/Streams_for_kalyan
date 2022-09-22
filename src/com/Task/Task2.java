package com.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Candidate{
    String id;
    int votes;

    public Candidate(String id, int votes) {
        this.id = id;
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id='" + id + '\'' +
                ", votes=" + votes +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}

public class Task2 {
    public static void main(String[] args) {

        //Get the most number of votes gained by a candidate and declare him the winner if there is any match with maximum number of votes
        //Sample Input: [{"Arjun", 25000}, {"Michael",800000}]
        //Sample Output: [{"Michael",800000}]
        List<Candidate> lst=new ArrayList<Candidate>();
        lst.add(new Candidate("Jonty2",1999));
        lst.add(new Candidate("js",1967));
        lst.add(new Candidate("Jonty",1967));
        lst.add(new Candidate("js1",1999));
        lst.add(new Candidate("Ar1",1999));

        //First Method
        Optional<Candidate> ans=lst.stream().collect(Collectors.maxBy(Comparator.comparing(Candidate::getVotes)));
        System.out.println(ans);

        //Second Method
        Optional<Candidate> winner = lst.stream().max(Comparator.comparing(p->p.getVotes()));
        System.out.println(winner);


    }
}
