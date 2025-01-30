package pl.pawel.demo.retrofit;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface GitHubClient {

     @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> reposForUsers(@Path("user") String user);

    @POST("/user/repos")
    Call<GitHubRepo> createRepository(@Header("Authorization") String apiKey, @Body GitHubRepo repo);
}
