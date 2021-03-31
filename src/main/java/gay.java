import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class gay extends ListenerAdapter{


    int Max=100,Min=0;
    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().equals("!gay")){
            int comin = (int)(Math.random() * (double)(Max - Min + 1) + (double)Min);
            e.getChannel().sendMessage("you are "+comin+"% gay XD").queue();


        }
    }
}