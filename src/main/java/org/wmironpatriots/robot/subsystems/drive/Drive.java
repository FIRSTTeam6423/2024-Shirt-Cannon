package org.wmironpatriots.robot.subsystems.drive;

import static org.wmironpatriots.robot.Constants.DriveConstantsK.*;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;

    private final RelativeEncoder leftEncoder;
    private final RelativeEncoder rightEncoder;

    public Drive() {
        leftMotor = new CANSparkMax(kdriveLeftMotorIDs[0], MotorType.kBrushless);
        rightMotor = new CANSparkMax(kdriveRightMotorIDs[0], MotorType.kBrushless);

        leftEncoder = leftMotor.getEncoder();
        rightEncoder = rightMotor.getEncoder();
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
    
        leftMotor.setVoltage(leftVoltage);
        rightMotor.setVoltage(rightVoltage);

    }
    
    /**
     * Sets motor speed
     * 
     * @param leftSpeed left motor speed
     * @param rightSpeed right motor speed
     */
    public void setMotorSpeed(double leftSpeed, double rightSpeed) {
    
        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);
    
    }

    /**
     * Stops Motors
     * 
     */
    public void stopMotors() {

        leftMotor.stopMotor();
        rightMotor.stopMotor();

    }

}