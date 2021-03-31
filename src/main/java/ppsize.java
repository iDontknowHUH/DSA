import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.lang.String;

public class ppsize extends ListenerAdapter{
    int Max=10,Min=0;
char[] str={'=','=','=','=','=','=','=','=','=','=','='};
char[] v=new char[Max];

    @Override
    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().equals("!ppsize")){
            int comin = (int)(Math.random() * (double)(Max - Min + 1) + (double)Min);

            for(int i=0;i<comin;i++){
               v[i]=str[i];

            }

            String s=new String(v);
            if(comin==0) {
                e.getChannel().sendMessage("pp not found :(").queue();
            }
            else {
                e.getChannel().sendMessage("("+s+"3").queue();

            }
        }
    }
}