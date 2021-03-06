package com.pet.lesnick.gitrepoobserverapp.webclient.interfaces;

import com.pet.lesnick.gitrepoobserverapp.webclient.model.GitHubRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {
    @GET("users/{user}/repos")
    Call<List<GitHubRepository>> getAllUsersRepositories(@Path("user") String user);
}
