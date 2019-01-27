package com.tony.util;

import com.tony.interfaces.*;
import java.util.*;
import android.app.*;

final class d extends TimerTask


//{
    {


        //private TimerInterface timer;
        private TimerInterface timer;

        //private MzActivity act;
        private Activity act;


        //public d(MzActivity mAct, TimerInterface t){
        public d(Activity mAct, TimerInterface t){

                //this.timer = t;
                this.timer = t;
                //this.act = mAct;
                this.act = mAct;

                //}
            }




        //@Override
        @Override




        //public void run ( )
        public void run ( )




        //{
            {




                //act.runOnUiThread(new c(timer));
                act.runOnUiThread(new c(timer));





                //}
            }






        //}
    }

