import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class help extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().equals("!help")){
            e.getChannel().sendMessage("1> gay(gay percentage check) \n 2> play(pp check) \n 3> invite(to invite me to your server)\n 4> ppsize(to check your pp size) \n 4>coming soon.. ").queue();
        }
    }
}
