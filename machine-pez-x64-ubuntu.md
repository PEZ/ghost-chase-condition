# machine-pez-x64-ubuntu

An ASUS Mini-PC with Ryzen 7 CPU and 16GB RAM, running Ubuntu Desktop

### uname -a

```
Linux drag-racer 5.13.0-27-generic #29~20.04.1-Ubuntu SMP Fri Jan 14 00:32:30 UTC 2022 x86_64 x86_64 x86_64 GNU/Linux
```

### lscpu

```
Architecture:                    x86_64
CPU op-mode(s):                  32-bit, 64-bit
Byte Order:                      Little Endian
Address sizes:                   48 bits physical, 48 bits virtual
CPU(s):                          16
On-line CPU(s) list:             0-15
Thread(s) per core:              2
Core(s) per socket:              8
Socket(s):                       1
NUMA node(s):                    1
Vendor ID:                       AuthenticAMD
CPU family:                      23
Model:                           104
Model name:                      AMD Ryzen 7 5700U with Radeon Graphics
Stepping:                        1
Frequency boost:                 enabled
CPU MHz:                         1400.000
CPU max MHz:                     4369,9209
CPU min MHz:                     1400,0000
BogoMIPS:                        3593.21
Virtualization:                  AMD-V
L1d cache:                       256 KiB
L1i cache:                       256 KiB
L2 cache:                        4 MiB
L3 cache:                        8 MiB
NUMA node0 CPU(s):               0-15
Vulnerability Itlb multihit:     Not affected
Vulnerability L1tf:              Not affected
Vulnerability Mds:               Not affected
Vulnerability Meltdown:          Not affected
Vulnerability Spec store bypass: Mitigation; Speculative Store Bypass disabled via prctl and seccomp
Vulnerability Spectre v1:        Mitigation; usercopy/swapgs barriers and __user pointer sanitization
Vulnerability Spectre v2:        Mitigation; Full AMD retpoline, IBPB conditional, IBRS_FW, STIBP conditional, RSB filling
Vulnerability Srbds:             Not affected
Vulnerability Tsx async abort:   Not affected
Flags:                           fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush mmx fxsr sse sse2 ht syscall nx mmxext fxsr_opt pdpe1gb rdtscp lm constant_tsc rep_good no
                                 pl nonstop_tsc cpuid extd_apicid aperfmperf pni pclmulqdq monitor ssse3 fma cx16 sse4_1 sse4_2 movbe popcnt aes xsave avx f16c rdrand lahf_lm cmp_legacy svm extapic cr8_l
                                 egacy abm sse4a misalignsse 3dnowprefetch osvw ibs skinit wdt tce topoext perfctr_core perfctr_nb bpext perfctr_llc mwaitx cpb cat_l3 cdp_l3 hw_pstate ssbd mba ibrs ibpb 
                                 stibp vmmcall fsgsbase bmi1 avx2 smep bmi2 cqm rdt_a rdseed adx smap clflushopt clwb sha_ni xsaveopt xsavec xgetbv1 xsaves cqm_llc cqm_occup_llc cqm_mbm_total cqm_mbm_loc
                                 al clzero irperf xsaveerptr rdpru wbnoinvd arat npt lbrv svm_lock nrip_save tsc_scale vmcb_clean flushbyasid decodeassists pausefilter pfthreshold avic v_vmsave_vmload vg
                                 if v_spec_ctrl umip rdpid overflow_recov succor smca
```

### lshw -short

```
H/W path            Device          Class          Description
==============================================================
                                    system         MINIPC PN51-E1
/0                                  bus            PN51-E1
/0/0                                memory         64KiB BIOS
/0/1e                               memory         16GiB System Memory
/0/1e/0                             memory         8GiB SODIMM DDR4 Synchronous Unbuffered (Unregistered) 3200 MHz (0,3 ns)
/0/1e/1                             memory         8GiB SODIMM DDR4 Synchronous Unbuffered (Unregistered) 3200 MHz (0,3 ns)
/0/20                               memory         512KiB L1 cache
/0/21                               memory         4MiB L2 cache
/0/22                               memory         8MiB L3 cache
/0/23                               processor      AMD Ryzen 7 5700U with Radeon Graphics
/0/100                              bridge         Renoir Root Complex
/0/100/0.2                          generic        Renoir IOMMU
/0/100/1.2                          bridge         Renoir PCIe GPP Bridge
/0/100/1.2/0                        bus            ASM1042A USB 3.0 Host Controller
/0/100/1.2/0/0      usb1            bus            xHCI Host Controller
/0/100/1.2/0/1      usb2            bus            xHCI Host Controller
/0/100/2.1                          bridge         Renoir PCIe GPP Bridge
/0/100/2.1/0        enp2s0          network        RTL8125 2.5GbE Controller
/0/100/2.2                          bridge         Renoir PCIe GPP Bridge
/0/100/2.2/0        wlp3s0          network        Wireless 8265 / 8275
/0/100/2.3                          bridge         Renoir PCIe GPP Bridge
/0/100/2.3/0                        storage        Sandisk Corp
/0/100/2.3/0/0      /dev/nvme0      storage        WDC PC SN530 SDBPNPZ-256G-1002
/0/100/2.3/0/0/1    /dev/nvme0n1    disk           256GB NVMe namespace
/0/100/2.3/0/0/1/1  /dev/nvme0n1p1  volume         511MiB Windows FAT volume
/0/100/2.3/0/0/1/2  /dev/nvme0n1p2  volume         237GiB EXT4 volume
/0/100/8.1                          bridge         Renoir Internal PCIe GPP Bridge to Bus
/0/100/8.1/0                        display        Advanced Micro Devices, Inc. [AMD/ATI]
/0/100/8.1/0.1                      multimedia     Advanced Micro Devices, Inc. [AMD/ATI]
/0/100/8.1/0.2                      generic        Family 17h (Models 10h-1fh) Platform Security Processor
/0/100/8.1/0.3                      bus            Renoir USB 3.1
/0/100/8.1/0.3/0    usb3            bus            xHCI Host Controller
/0/100/8.1/0.3/0/4                  generic        USB2.0-CRW
/0/100/8.1/0.3/1    usb4            bus            xHCI Host Controller
/0/100/8.1/0.4                      bus            Renoir USB 3.1
/0/100/8.1/0.4/0    usb5            bus            xHCI Host Controller
/0/100/8.1/0.4/0/3                  communication  Bluetooth wireless interface
/0/100/8.1/0.4/1    usb6            bus            xHCI Host Controller
/0/100/8.1/0.5                      multimedia     Raven/Raven2/FireFlight/Renoir Audio Processor
/0/100/8.1/0.6                      multimedia     Family 17h (Models 10h-1fh) HD Audio Controller
/0/100/8.1/0.7                      generic        Raven/Raven2/Renoir Sensor Fusion Hub
/0/100/8.2                          bridge         Renoir Internal PCIe GPP Bridge to Bus
/0/100/8.2/0                        storage        FCH SATA Controller [AHCI mode]
/0/100/8.2/0.1                      storage        FCH SATA Controller [AHCI mode]
/0/100/14                           bus            FCH SMBus Controller
/0/100/14.3                         bridge         FCH LPC Bridge
/0/101                              bridge         Renoir PCIe Dummy Host Bridge
/0/102                              bridge         Renoir PCIe Dummy Host Bridge
/0/103                              bridge         Renoir PCIe Dummy Host Bridge
/0/104                              bridge         Renoir Device 24: Function 0
/0/105                              bridge         Renoir Device 24: Function 1
/0/106                              bridge         Renoir Device 24: Function 2
/0/107                              bridge         Renoir Device 24: Function 3
/0/108                              bridge         Renoir Device 24: Function 4
/0/109                              bridge         Renoir Device 24: Function 5
/0/10a                              bridge         Renoir Device 24: Function 6
/0/10b                              bridge         Renoir Device 24: Function 7
/0/1                                system         PnP device PNP0c01
/0/2                                system         PnP device PNP0b00
/0/3                                generic        PnP device ITE8708
/0/4                                system         PnP device PNP0c02
```
