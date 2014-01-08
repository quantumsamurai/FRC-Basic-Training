/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Talon;


public class BasicStart extends SimpleRobot {
    //Sensors
    Gyro gyro = new Gyro(1);
    Encoder left_encoder = new Encoder(1,2);
    //Joysticks
    Joystick joystick_1 = new Joystick(1);
    Joystick joystick_2 = new Joystick(2);
    //Talons
    Talon talon_sr = new Talon(1);
    Talon talon = new Talon(2);
    //Relay
    Relay vex_relay = new Relay(1);
    
    
    
 
    public void autonomous() { // This is where we write code for autonomous 
        left_encoder.start();
        System.out.println("Encoder Rate: " + left_encoder.getRate());
        System.out.println("Encoder Distance: " + left_encoder.getDistance());
        System.out.println("Encoder: Temporary Disabled" );
        try {
            left_encoder.wait(200);
        } catch (InterruptedException ex) {
        }
    }

  
    public void operatorControl() { // Teleop Entered
       System.out.println("Gyro Angle: "+ gyro.getAngle()); 
      talon_sr.set(1);
      
      
       
    }

    public void test() { //Test Entered
    
    }
}
