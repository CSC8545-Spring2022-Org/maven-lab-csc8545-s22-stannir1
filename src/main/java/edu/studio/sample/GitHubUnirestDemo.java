package edu.studio.sample;
import kong.unirest.Unirest;

public class GitHubUnirestDemo {

    public static final String GITHUB_API_URI = "https://api.github.com/repos/CSC8545-Spring2022-Org/maven-lab-csc8545-s22-stannir1/issues";
    
    public static void main(String[] args) {
        String getAllResponse = Unirest.get(GITHUB_API_URI)
                                .header("Authorization","Bearer " + args[0])
                                .asString()
                                .getBody();
        System.out.println("GET ALL" + getAllResponse);
        
    }
}
