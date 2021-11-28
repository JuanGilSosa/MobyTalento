package com.Moby.app;

import com.Moby.app.Controller.ContextProvider;
import com.Moby.app.Views.MainFrame;

public class App 
{
    public static void main( String[] args )
    {
        MainFrame frame = (MainFrame)ContextProvider.GetBean("mainFrame"); 
        frame.setVisible(true);
    }
}
