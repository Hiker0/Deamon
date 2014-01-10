package com.sign.deamon;

import android.os.Bundle;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class WelcomeActivity extends Activity {
	ImageView welcom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_welcome);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        welcom = new ImageView(this);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);
        welcom.setLayoutParams(params);
        welcom.setImageResource(R.drawable.sign);
        
        setContentView(welcom);
        
    }
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
	    float[] arrayOfFloat1 = new float[2];
	    arrayOfFloat1[0] = 0.5F;
	    arrayOfFloat1[1] = 1.0F;
	    ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(welcom, "scaleX", arrayOfFloat1);

	    float[] arrayOfFloat2 = new float[2];
	    arrayOfFloat2[0] = 0.5F;
	    arrayOfFloat2[1] = 1.0F;
	    ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(welcom, "scaleY", arrayOfFloat2);

	    float[] arrayOfFloat3 = new float[2];
	    arrayOfFloat3[0] = 0.0F;
	    arrayOfFloat3[1] = 1.0F;
	    ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(welcom, "alpha", arrayOfFloat3);
	    
	    AnimatorSet localAnimatorSet1 = new AnimatorSet();
	    Animator[] arrayOfAnimator1 = new Animator[3];
	    arrayOfAnimator1[0] = localObjectAnimator1;
	    arrayOfAnimator1[1] = localObjectAnimator2;
	    arrayOfAnimator1[2] = localObjectAnimator3;
	    localAnimatorSet1.playTogether(arrayOfAnimator1);
	    localAnimatorSet1.setDuration(3000);
	    
	    AnimatorListener listener = new AnimatorListener(){

			@Override
			public void onAnimationCancel(Animator animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationEnd(Animator animation) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent();
				intent.setClass(WelcomeActivity.this, com.sign.deamon.Start.class);
				WelcomeActivity.this.startActivity(intent );
					WelcomeActivity.this.finish();

			}

			@Override
			public void onAnimationRepeat(Animator animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationStart(Animator animation) {
				// TODO Auto-generated method stub
				
			}
	    	
	    };
		localAnimatorSet1.addListener(listener);
	    localAnimatorSet1.start();

		
	}
	
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		

	}
    
    


    
}
