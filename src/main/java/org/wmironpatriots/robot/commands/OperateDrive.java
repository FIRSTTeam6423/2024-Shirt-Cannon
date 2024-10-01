package org.wmironpatriots.robot.commands;

import static edu.wpi.first.units.Units.Value;
import static org.wmironpatriots.robot.Constants.DRIVE_CONSTANTS.DRIVE_SPEED;

import org.wmironpatriots.robot.Util.CommandController;
import org.wmironpatriots.robot.subsystems.drive.Drive;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class OperateDrive {
    private final Drive drive;
    private final CommandController controller;
    
    public OperateDrive(Drive drive, CommandController controller) {

        this.drive = drive;
        this.controller = controller;

    }

    public Command driveRobot() {

        return Commands.run(() -> {
            drive.setMotorSpeed(
                controller.getJoystickAxis(XboxController.Axis.kLeftY.value) * DRIVE_SPEED, 
                controller.getJoystickAxis(XboxController.Axis.kRightY.value) * DRIVE_SPEED
            );
        }, drive);

    }

}