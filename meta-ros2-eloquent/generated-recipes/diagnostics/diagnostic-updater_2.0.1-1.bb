# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "diagnostic_updater contains tools for easily updating diagnostics. it is commonly used in device drivers to keep track of the status of output topics, device status, etc."
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Kevin Watts"
HOMEPAGE = "http://www.ros.org/wiki/diagnostic_updater"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "diagnostics"
ROS_BPN = "diagnostic_updater"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    rclcpp \
    rclpy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    rclcpp \
    rclpy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    rclcpp \
    rclpy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    rclcpp-lifecycle \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/diagnostics-release/archive/release/eloquent/diagnostic_updater/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/diagnostic_updater"
SRC_URI = "git://github.com/ros2-gbp/diagnostics-release;${ROS_BRANCH};protocol=https"
SRCREV = "839adb5e3f798b1a5158a6a9d8900784e157b3cd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}