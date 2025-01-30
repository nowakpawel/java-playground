package pl.pawel.demo.retrofit;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pl.pawel.demo.retrofit.configuration.PropertiesConfig;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GitHubClientService {
    private final GitHubClient client;
    private final PropertiesConfig propertiesConfig;

    public List<GitHubRepo> getRepos(String username) throws IOException {
        Response<List<GitHubRepo>> response = client.reposForUsers(username).execute();

        if (response.isSuccessful()) {
            return response.body();
        } else {
            throw new RuntimeException("Unsuccessful response");
        }
    }

    public GitHubRepo createRepository(GitHubRepo repository) throws IOException {
        Response<GitHubRepo> response = client.createRepository(propertiesConfig.getToken(), repository).execute();

        if (response.isSuccessful()) {
            return response.body();
        } else {
            throw new RuntimeException("Unsuccessful response");
        }
    }

}
