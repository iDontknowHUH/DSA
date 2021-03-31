import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) {
        JDABuilder jdaBuilder= JDABuilder.createDefault("ODI1NjA0OTgzMDEyNzIwNjUw.YGAWjg.hJRo25l0ZAFhQx59VfgerXPdbZA");
        JDA jda=null;
        pingpong pingpong=new pingpong();
        jdaBuilder.addEventListeners(pingpong);
        invite invite=new invite();
        jdaBuilder.addEventListeners(invite);
        play play=new play();
        jdaBuilder.addEventListeners(play);
        gay gay=new gay();
        jdaBuilder.addEventListeners(gay);
        help help=new help();
        jdaBuilder.addEventListeners(help);
        ppsize ppsize=new ppsize();
        jdaBuilder.addEventListeners(ppsize);
        try {
            jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
