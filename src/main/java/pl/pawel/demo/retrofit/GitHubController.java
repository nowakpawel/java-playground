package pl.pawel.demo.retrofit;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/github-client")
public class GitHubController {
    private final GitHubClientService clientService;

    @GetMapping("/{username}")
    public List<GitHubRepo> showRepos(@PathVariable("username") String username) throws IOException {
        log.info("Inside controller");
        return clientService.getRepos(username);
    }

   @PostMapping("/create")
    public GitHubRepo createRepository(@RequestBody GitHubRepo repository) throws IOException {
        return clientService.createRepository(repository);
   }
}
