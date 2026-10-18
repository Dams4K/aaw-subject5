package up.serli.aawsubject5.config;

import net.dv8tion.jda.api.JDA;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscordConfig {
    @Value("${discord.token}")
    private String token;

    @Bean()
    public JDA jda() {

    }
}
