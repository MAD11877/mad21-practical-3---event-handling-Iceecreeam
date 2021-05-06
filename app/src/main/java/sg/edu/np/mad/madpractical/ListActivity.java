package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Context context = getApplicationContext();

        ImageView img = (ImageView) findViewById(R.id.imgProfile1);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setPositiveButton("CLOSE", null);
                builder.setNegativeButton("VIEW",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Integer rand = new Random().nextInt();

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                        intent.putExtra("RandomInt", String.valueOf(rand));
                        startActivity(intent);

                    }
                });
                builder.show();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v("Debug", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Debug", "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Debug", "Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Debug", "Stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("Debug", "Destroy");
    }
}

