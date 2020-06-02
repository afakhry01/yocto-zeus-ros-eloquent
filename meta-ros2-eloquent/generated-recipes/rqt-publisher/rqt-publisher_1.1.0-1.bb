# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed or computed field values."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Dorian Scholz"
HOMEPAGE = "http://wiki.ros.org/rqt_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_publisher"
ROS_BPN = "rqt_publisher"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    python3-catkin-pkg \
    qt-gui-py-common \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rqt_publisher-release/archive/release/eloquent/rqt_publisher/1.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/rqt_publisher"
SRC_URI = "git://github.com/ros2-gbp/rqt_publisher-release;${ROS_BRANCH};protocol=https"
SRCREV = "dd267d697c4fe7784285b0859392374ef037fce1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
