package br.com.powell.tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView listaOpcoesLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listaOpcoesLayout = (ListView) findViewById(R.id.listViewLayout);
 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
        		android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.layout));
        listaOpcoesLayout.setAdapter(adapter);
    }
}
