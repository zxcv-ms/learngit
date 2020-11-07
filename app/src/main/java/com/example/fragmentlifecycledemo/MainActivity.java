package com.example.fragmentlifecycledemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    private  final static String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"Activity--onCreate()");
        /*android.app.Fragment tFragment = new MainActivity.TFragment();
        getFragmentManager().beginTransaction().add(R.id.frag,tFragment).commit();*/
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity--onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity--onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity--onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity--onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity--onDestroy()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity--onRestart()");
    }

    public static class TFragment extends android.app.Fragment{
        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            Log.d(TAG,"Fragment--onAttach()");
        }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d(TAG,"Fragment--onCreate()");
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            Log.d(TAG,"Fragment--onCreateView()");
            return super.onCreateView(inflater, container, savedInstanceState);
        }

        @Override
        public void onActivityCreated(@Nullable Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            Log.d(TAG,"Fragment--onActivityCreated()");
        }

        @Override
        public void onStart() {
            super.onStart();
            Log.d(TAG,"Fragment--onStart()");
        }

        @Override
        public void onResume() {
            super.onResume();
            Log.d(TAG,"Fragment--onResume()");
        }

        @Override
        public void onPause() {
            super.onPause();
            Log.d(TAG,"Fragment--onPause()");
        }

        @Override
        public void onStop() {
            super.onStop();
            Log.d(TAG,"Fragment--onStop()");
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            Log.d(TAG,"Fragment--onDestroyView()");
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(TAG,"Fragment--onDestroy()");
        }

        @Override
        public void onDetach() {
            super.onDetach();
            Log.d(TAG,"Fragment--onDetach()");
        }
    }
}
