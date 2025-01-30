package pl.pawel.demo.retrofit;

import lombok.AllArgsConstructor;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.pawel.demo.retrofit.configuration.PropertiesConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
@AllArgsConstructor
public class GitHubApiConfig {
    private final PropertiesConfig propertiesConfig;

    @Bean
    public GitHubClient getGithubClient() {
        OkHttpClient httpClient = new OkHttpClient();

        return new Retrofit.Builder()
                .baseUrl(propertiesConfig.getUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GitHubClient.class);
    }
}
