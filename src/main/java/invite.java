import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class invite extends ListenerAdapter{
    @Override


            public void onMessageReceived(MessageReceivedEvent e){
                if(e.getMessage().getContentRaw().equals("!invite")){
                    e.getChannel().sendMessage("https://discord.com/oauth2/authorize?client_id=825604983012720650&scope=bot").queue();


        }
    }
}
