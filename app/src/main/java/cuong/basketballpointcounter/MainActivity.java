package cuong.basketballpointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int[] home = new int[10000];
    int[] guest = new int[10000];
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home[0]=0;
        guest[0]=0;
    }

    int N=0;
    public void home3(View v)
    {
        N++;
        home[N] = home[N-1] + 3;
        guest[N] = guest[N-1];
        displayHome(home[N]);
    }
    public void home2(View v)
    {
        N++;
        home[N] = home[N-1] + 2;
        guest[N] = guest[N-1];
        displayHome(home[N]);
    }
    public void home1(View v)
    {
        N++;
        home[N] = home[N-1] + 1;
        guest[N] = guest[N-1];
        displayHome(home[N]);
    }

    protected void displayHome(int n)
    {
        String homePoint="" + (n);
        TextView s = (TextView) findViewById(R.id.homeText);
        s.setText(homePoint);
    }
    /*---------------------------*/
    public void guest3(View v)
    {
        N++;
        home[N] = home[N-1];
        guest[N] = guest[N-1] + 3;
        displayGuest(guest[N]);
    }
    public void guest2(View v)
    {
        N++;
        home[N] = home[N-1];
        guest[N] = guest[N-1] + 2;
        displayGuest(guest[N]);
    }
    public void guest1(View v)
    {
        N++;
        home[N] = home[N-1];
        guest[N] = guest[N-1] + 1;
        displayGuest(guest[N]);
    }

    protected void displayGuest(int n)
    {
        String guestPoint="" + (n);
        TextView s = (TextView) findViewById(R.id.guestText);
        s.setText(guestPoint);
    }
    /*------------------------------*/
    public void undo(View v)
    {
        if (N>0) N--; else N = 0;
        displayHome(home[N]);
        displayGuest(guest[N]);
    }
    /*------------------------------*/
    public void finish(View v)
    {
        String res;
        TextView s = (TextView) findViewById(R.id.resText);
        if (home[N]==guest[N]) res="DRAW!";
        else if (home[N]<guest[N]) res="GUEST WON!";
        else res="HOME WON!";
        s.setText(res);
    }
    /*------------------------------*/
    public void reset(View v)
    {
        N=0;
        String ss ="0";
        TextView a = (TextView) findViewById(R.id.homeText);
        a.setText(ss);
        TextView b = (TextView) findViewById(R.id.guestText);
        b.setText(ss);
        ss="";
        TextView c = (TextView) findViewById(R.id.resText);
        c.setText(ss);
    }
}
