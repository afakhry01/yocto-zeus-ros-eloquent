require go-common.inc

GO_BASEVERSION = "1.12"
GO_MINOR = ".9"
PV .= "${GO_MINOR}"
FILESEXTRAPATHS_prepend := "${FILE_DIRNAME}/go-${GO_BASEVERSION}:"

LIC_FILES_CHKSUM = "file://LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707"

SRC_URI += "\
    file://0001-allow-CC-and-CXX-to-have-multiple-words.patch \
    file://0002-cmd-go-make-content-based-hash-generation-less-pedan.patch \
    file://0003-allow-GOTOOLDIR-to-be-overridden-in-the-environment.patch \
    file://0004-ld-add-soname-to-shareable-objects.patch \
    file://0005-make.bash-override-CC-when-building-dist-and-go_boot.patch \
    file://0006-cmd-dist-separate-host-and-target-builds.patch \
    file://0007-cmd-go-make-GOROOT-precious-by-default.patch \
    file://0008-use-GOBUILDMODE-to-set-buildmode.patch \
    file://0001-release-branch.go1.12-security-net-textproto-don-t-n.patch \
    file://0010-fix-CVE-2019-17596.patch \
"
SRC_URI_append_libc-musl = " file://0009-ld-replace-glibc-dynamic-linker-with-musl.patch"

SRC_URI[main.md5sum] = "6132109d4050da349eadc9f7b0304ef4"
SRC_URI[main.sha256sum] = "ab0e56ed9c4732a653ed22e232652709afbf573e710f56a07f7fdeca578d62fc"
