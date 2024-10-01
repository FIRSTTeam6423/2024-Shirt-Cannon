// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wmironpatriots.robot;

public class RobotContainer {
  // * ------ SUBSYSTEMS ------

  // * ------ COMMAND GROUPS ------

  // * ------ AUTO (womp womp) ------

  // * ------ CONTROLLERS ------
  
  public RobotContainer() {
    //* init subsystems here
    configureDefaultCommands();
    configureBindings();
  }

  public void configureDefaultCommands() {}

  private void configureBindings() {
    // ---- TRIGGERS ----

    // ---- DRIVER BINDS ----
    // * Left Trigger Axis is used for slow mode

    // ---- OPERATOR BINDS ----
  }
}
