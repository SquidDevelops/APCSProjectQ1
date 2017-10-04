package net.tesqgr.VotingFrakenstien;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicReference;

public class VotingFrakenstien {

  public static void main(String[] args){
    AtomicReference<JFrame> frame = new AtomicReference<>(new JFrame());

    frame.get().setSize(800, 500);
    frame.get().setTitle("your mom");
    frame.get().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


  }
}
