# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS_remove = "python-numpy"
ROS_BUILD_DEPENDS_remove = "python3-numpy"

ROS_BUILDTOOL_DEPENDS += " \
    ${PYTHON_PN}-numpy-native \
"

# As of [thud], boost-python is part of boost (and it's always called boost-python, even if it's for Python 3). This setting
# skips the check for a separate boost-python* package.
EXTRA_OECMAKE += "-DANDROID=ON"
