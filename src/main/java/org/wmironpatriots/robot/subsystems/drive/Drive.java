package org.wmironpatriots.robot.subsystems.drive;

import static org.wmironpatriots.robot.Constants.DriveConstantsK.*;

import java.util.List;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

    private final CANSparkMax leftMotorA;
    private final CANSparkMax leftMotorB;
    private final CANSparkMax leftMotorC;
    private final CANSparkMax rightMotorA;
    private final CANSparkMax rightMotorB;
    private final CANSparkMax rightMotorC;
    private final List<CANSparkMax> leftMotors;
    private final List<CANSparkMax> rightMotors;

    private final RelativeEncoder leftEncoder;
    private final RelativeEncoder rightEncoder;

    public Drive() {
        leftMotorA = new CANSparkMax(kdriveLeftMotorIDs[0], MotorType.kBrushless);
        leftMotorB = new CANSparkMax(kdriveLeftMotorIDs[1], MotorType.kBrushless);
        leftMotorC = new CANSparkMax(kdriveLeftMotorIDs[2], MotorType.kBrushless);
        rightMotorA = new CANSparkMax(kdriveRightMotorIDs[0], MotorType.kBrushless);
        rightMotorB = new CANSparkMax(kdriveRightMotorIDs[1], MotorType.kBrushless);
        rightMotorC = new CANSparkMax(kdriveRightMotorIDs[2], MotorType.kBrushless);

        leftMotors = List.of(leftMotorA, leftMotorB, leftMotorC);
        rightMotors = List.of(rightMotorA, rightMotorB, rightMotorC);

        leftEncoder = leftMotors.get(0).getEncoder();
        rightEncoder = rightMotors.get(0).getEncoder();
    }

    // * GETTERS

    /**
     * Get Left-Motor A's velocity
     * 
     * @return {@link double}
     */
    public double getLeftMotorVelocity() {

        return leftEncoder.getVelocity();
        
    }

    /**
     * Get Right-Motor A's velocity
     * 
     * @return {@link double}
     */
    public double getRightMotorVelocity() {

        return rightEncoder.getVelocity();

    }

    // * SETTERS

    /**
     * Sets the raw motor voltage
     * 
     * @param leftVoltage Voltage to go into left motors
     * @param rightVoltage Voltage to go into right motors
     */
    public void setMotorVoltage(double leftVoltage, double rightVoltage) {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).setVoltage(leftVoltage);
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).setVoltage(rightVoltage);
        }
    }
    
    /**
     * Sets motor speed
     * 
     * @param leftSpeed left motor speed
     * @param rightSpeed right motor speed
     */
    public void setMotorSpeed(double leftSpeed, double rightSpeed) {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).set(leftSpeed);
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).set(rightSpeed);
        }
    }

    /**
     * Stops Motors
     * 
     */
    public void stopMotors() {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).stopMotor();
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).stopMotor();
        }
    }

    

}