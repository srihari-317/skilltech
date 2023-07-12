C Programming Essentials
Martin P. Bates, in Programming 8-bit PIC Microcontrollers in C, 2008

Program Directives
Examples using the directives encountered thus far follow. Refer to the compiler reference manual for the full range of options.

?include “16F877A.h”

The include directive allows source code files to be included as though they had been typed in by the user. In fact, any block of source code can be included in this way, and the directive can thus be used to incorporate previously written reusable functions. The header file referred to in this case provides the information needed by the complier to create a program for a specific PIC chip.

?use delay(clock=4000000)

The use directive allows library files to be included. As can be seen, additional operating parameters may be needed so that the library function works correctly. The clock frequency given here needs to be specified so that both software and hardware timing loops can be correctly calculated.

?use rs232(baud=9600, xmit=PIN_D0, rcv=PIN_D1)

In this directive, the parameters set the RS232 data (baud) rate and the MCU pins to be used to transmit and receive the signal. This software serial driver allows any available pin to be used.

Extending Tcl
Clif Flynt, in Tcl/Tk (Third Edition), 2012

15.2.1 Structural Overview of an Extension
An extension consists of one or more source code files, one or more include files, and a Makefile or VC++, Borland, or CodeWarrior Project files. The source code files must contain a function with initialization code, and that function must conform to the naming conventions described in Section 15.2.2.

The source code files will include at least one function that adds new commands to the interpreter and at least one function to implement the new commands. A common structure is to create two files: one with the initialization function that adds the new commands to the interpreter and a second file with the functions that implement the new commands.

All code that uses functions from the Tcl library will need to include tcl.h. The tcl.h file has all the function prototypes, #define, data definitions, and so on required to interact with the Tcl library functions.

OSS Gazette a to z
In Securing HP NonStop Servers in an Open Systems World, 2006

Compilers in the OSS Environment
Compilers generate object (executable) files from source code files. There are several utilities, libraries and objects used by compilers:

Compiler languages:
C/C++

COBOL85

SQL


Objects:
System libraries

Common runtime libraries

User libraries


Compilers and their related utilities are resources whose security varies depending on the Corporate Security Policy concerning compilation on secure systems. Many sites control compilations by enforcing the requirement that all compilation be performed on a development system. Application change control policy governs the method and security to update the secure application.

Some sites do not use certain languages, but all sites use at least one language compiler for the secure application. Language compilation controls are the fundamental method that a company has to control their application.

RISK
Compilers can be destructive, because code can be inserted or deleted to circumvent previously implemented controls.

RISK
Language compilers can be used to develop test or hacking programs to access sensitive data.

On secure systems, languages that are not in active use should be secured from use and other language compilers should be accessible only to necessary personnel.

On secure systems, only members of the group (if any) responsible for compiling programs on the secure system should have access to secure object files.

AP-ADVICE-COMPILER-01
To protect applications from inadvertent or malicious changes or outages, compilers and related utilities should be absent or very tightly secured on secure systems.

AP-ADVICE-COMPILER-02
On secure systems, compilers should not be accessible in order to prevent unauthorized access to secure data.

On development systems, members of the development group responsible for compiling programs should have access according to need.

AP-ADVICE-COMPILER-03
Compilers and their associated files should be accessible to the groups needing access.

Read more
A Choquet Integral Toolbox and Its Application in Customer Preference Analysis
Huy Quan Vu, ... Gang Li, in Data Mining Applications with R, 2014

9.3.1 Installation
The Rfmtool toolbox is distributed as a standard R package containing source code files, data sample, and examples. The toolbox can be downloaded from www.tulip.org.au/resources/rfmtool. There are two distribution files; the file Rfmtool. zip is for installation and running on the Windows platform and the file Rfmtool.tar.gz is for the Linux platform.

It should be noted that the routine code for fuzzy measure operation is mainly written in C/C++ (Beliakov, 2007). The source files of Rfmtool also contain the source code of the Lp_solve library (Berkelaar and Buttrey, 2011), because the operation of Rfmtool depends on this library for solving linear, integer, and mixed integer programs. We supplied a “wrapper” function, which allows all of the operations and data input/output to be performed in the R environment.

After downloading, Windows users can install this toolbox by selecting the installation package from the local zip files menu bar in the R graphic user interface. For Linux users, the package can be installed by typing the command:

$ R CMD INSTALL Rfmtool.tar.gz

Note that the Rfmtool package requires the C/C++ compiler gcc version 4.6.0 or above to be available for installation in Linux.

Users can verify if the package has been installed successfully by calling a testing function in the R environment:

> # Load the package

> library(“Rfmtool”)

> # Call the testing function.

> fm.test()

> # The following output is expected.

[1] “Choquet Integral from general fuzzy measure”

[1] 0.62

[1] “Choquet Integral from Mobius fuzzy measure”

[1] 0.62

[1] “Mobius transform”

[1] 0.0 0.3 0.5 -0.2 0.4 0.1 -0.2 0.1

[1] “Zeta transform”

[1] 0.00 0.18 0.15 0.28 0.23 0.48 0.56 1.00

[1] “Shapley value”

[1] 0.2833 0.3333 0.3833

[1] “Interaction Index”

[1] 0.00 0.18 0.15 0.28 0.23 0.48 0.56 1.00

Read more
Programming
Philip Bourne, ... Joseph McMullen, in UNIX for OpenVMS Users (Third Edition), 2003

9.3 Debugging Programs: error and dbx
Table 9.1 lists several UNIX tools for debugging programs. Here, we consider two source-level debugging tools, the error command and the dbx utility.

The command error inserts error messages generated by incorrect syntax into the source-code file. Compare with the /LIST qualifier used by the OpenVMS compilers, which provide a separate file (.LIS) locating syntax errors and displaying other useful information. The error lines appear in the source-code file as comments and therefore do not affect subsequent compilations. Since numerous messages make the source code difficult to read, you should make a copy of the source code before invoking error or perform a global edit and delete when the source code is completely debugged. For example, the command sed /^C###/d myprog. f removes all comments generated by error from the FORTRAN source code file myprog.f (see Section 5.3).

OpenVMS	UNIX
Form:	
$ FORTRAN/LIST source-file $ CC/LIST source-file	%f77 source-file [& error
Example:	
$ TYPE MYPROG.FOR
READ (5,*) A
WRITE (6,*] A
END	% cat myprog.f
read (5,*) a
write (6,*] a
end
$ FORTRAN/LIST MYPROG.FOR	% f77myprog.f |& error
%FORT-F-MISSDEL Missing operator or delimiter [write (6,*]] in module MYPROG$MAIN at line 3	1 file contains errors \
File "myprog.f” (1)
File "myprog.f" has 1 error.
…	1 of these errors can be inserted into the file
You touched file(s): "myprog.f"
Example:	
$ TYPE MYPROG.LIS	% cat myprog.f
…	(5,*]a
0001 READ (5,*) A	C# [f77] Error on line 2 of myprog. f
0002 WRITE (6,*] A	\
%FORT-F-MISSDEL. Missing operator	
or -	Syntax Error at "]"%%%
delimiter	write (6,*] a
…	…
The command f77 myprog. f |& error performs a FORTRAN compilation of myprog. f, piping error messages to the error command, which inserts them at the appropriate places in the source code. Each error begins with c### followed by the line number, interpreted as a comment in later compilations (compare with /*###… */ for C programs).

dbx is a BSD source-level interactive debugger for the C, FORTRAN, and PASCAL languages (compare with the OpenVMS utility DEBUG). Table 9.2 compares OpenVMS and UNIX interactive debugger commands. Users of the OpenVMS debugger may be disappointed with dbx. The OpenVMS and UNIX debuggers offer similar functionality, albeit using a different syntax, although not all features of DEBUG are in the UNIX debugger. For example, in UNIX, without a windowing interface, you cannot use a split screen to display simultaneously the values of variables and the section of code that generated them.

Table 9.2. Subset of dbx Commands

UNIX dbx	OpenVMS DEBUG	Function
Execution and Tracing
run [args]	GO [address-expression]	Begins executing
rerun [args]	GO [address-expression]	Restarts execution
trace [trace] [if]	SET TRACE [/QUALIFIER (S)] - [WHEN.. DO]	Traces execution of a line, procedure, change to a variable, or print expression when line is reached
stop [if. at. in]	SET BREAK- [/QUALIFIER (S)] - [WHEN.. DO]	Stops execution at some point
status	SHOW BREAK - [/QUALIFIER (S)]	Displays active stop points
SHOW TRACE - [/QUALIFIER (S)]	Displays active trace points
delete	CANCEL BREAK - [/QUALIFIER (S)]	Removes active stop points
CANCEL TRACE - [/QUALIFIER (S)]	Removes active trace points
cont	GO	Continues execution
step	STEP	Executes one source line
next		Steps to next line, executing calls
call [proc]		Executes object code associated with procedure
Printing Variables and Expressions
dump [proc]	SHOW SYMBOL	Displays names and values of variables in procedure
print	EXAMINE [/QUALIFIER (S)]	Displays variables
what is	SHOW TYPE	Displays declaration of variable (e.g., real)
where	SHOW MODULE	Prints active procedure and function
Source File Access
/pattern/	SEARCH [/QUALIFIER (S)]	Searches forward or backward for pattern
edit [file]	EDIT F MODULE NAMEXLINEl	Invokes editor
file file	SET SOURCE	Changes current source file (or returns name if no argument is given)
func function	SET MODULE	Changes current function (or returns current function if no arguments are given)
list [line1, line2]	TYPE line1-.line 2	Displays lines of text (default 10)
use dirs		Searches directory for source files
Aliases and Variables
alias [chars string]	DEFINE [/QUALIFIER (S)]	Defines chars to be an alias for
string
set var [= expr]	DEPOSIT [/QUALIFIER (S)]	Defines value for a variable
unalias chars	UNDEFINE [/QUALIFIER (S)]	Removes an alias
unset var		Removes a variable
Miscellaneous
help	HELP	Calls online help
quit	EXIT	Quits the debugger
sh command	SPAWN	Passes command to shell for execution
source file	@ file-spec	Reads and executes commands from a file
The following example illustrates a simple use of the debugger: The user invokes the debugger, lists source code, sets a breakpoint, examines a variable, changes the variable at the breakpoint, and runs the program.

The dbx utility invokes the debugger (compare with the OpenVMS command RUN/DEBUG) provided you previously compiled and loaded the source code with the -g option, which produces additional symbol table information needed by the debugger. The debugger uses the file a.out if you specify no other executable image. The debugger issues the (dbx) prompt (compare with the OpenVMS prompt DBG >) when ready to receive commands; list 1,7 (compare with the OpenVMS DEBUG command TYPE 1: 7) lists the first seven lines of the source file; stop at 4 (compare with the OpenVMS DEBUG command SET BREAK %LINE 4) sets a break point at line 4; run chkl.in (compare with the OpenVMS DEBUG command GO) executes the program. Rather than accepting input from the keyboard (stdin), the debugger reads input from the file hkl.in. When execution stops at the breakpoint, print nref displays the value of the variable nref (compare with the OpenVMS DEBUG command EXAMINE NREF); assign nref = 4 changes this value (compare with the OpenVMS DEBUG command DEPOSIT NREF = 4); and the cont command continues program execution (compare with the OpenVMS DEBUG command GO).

OpenVMS	UNIX
Form:	
$ FORTRAN/DEBUG/NOOPT - [source-file]	% f77 -g [source-file]
$ LINK/DEBUG [object-file]
$ RUN [executable-file]	% dbx
DEBUG Version V4.7-1	dbx version 2.0 of 4/2/87 22:10. Type ’help' for help,
%DEBUG-I-INITIAL, language is - FORTRAN.module set to IFCONVERT$MAIN	enter object file name (default is ‘a.out’):
DBG >	reading symbolic information
Example:	(dbx)
$ ASSIGN HKL.IN FOR005 $ RUN FCONVERT.EXE	% dbx fconvert.exe
DBG > TYPE 1:7	(dbx) list 1,7
1 integer h	1 integer h
2 dimension fii(10)	2 dimension fii(10)
3 nref = 0	3 nref - 0
4 read (5,2) nsf	4 read (5,2) nsf
5 write (6,2) nsf	5 write (6,2) nsf
6 10 read	6 10 read,2,end=100)h,k,1,fo,sigf,
(5,2,end=100)h,k,1,fo,sigf, -
stol, (fii(i),i = l.nsf)	\
stol, (fii(i),i = l.nsf)
7write (6,2)	7 write (6,2)
h,k,1,fo,sigf,stol,(fii(i),i=l.nsf) DBG > SET BREAK %LINE 4	h,k,1,fo,sigf,(fii(i),i = l.nsf) (dbx) stop at 4 [1] stop at 4
DBG > SHOW BREAK breakpoint at FCONVERT$MAIN\	
%LINE 4	(dbx) status
DBG > GO	[1] stop at 4
break at FCONVERT$MAIN\%LINE 4	(dbx) run < hkl.in
4: read (5,2) nsf	[1] stopped in MAIN at line 4
DBG > EXAMINE NREF	4 read (5,2) nsf
FCONVERT$MAIN\NREF 0	(dbx) print nref
DBG > DEPOSIT NREF = 4	0
DBG > EXAMINE NREF	(dbx) assign nref = 4
FCONVERT$MAIN\NREF 4	
DBG > GO	4
…	(dbx) cont
…
Read more
Recommended publications

Journal of Systems and Software
Journal of Systems and Software
Journal
Computer Physics Communications
Computer Physics Communications
Journal
Information and Software Technology
Information and Software Technology
Journal
Expert Systems with Applications
Expert Systems with Applications
Journal
Auditable Version Control Systems in Untrusted Public Clouds
Bo Chen, ... Jun Dai, in Software Architecture for Big Data and the Cloud, 2017

17.2.1 Data Organization in Version Control Systems
In software development, version control systems have been used broadly in managing source code, documentation, and configuration files. Typically, the VCS clients interact with a VCS server and the VCS server stores all the changes to the data in a main repository, such that an arbitrary version of the data can be retrieved at any time in the future. Each VCS client has a local repository, which stores the working copy (i.e., the version of the data that was last checked out by the client from the main VCS repository), the changes made by the client to the working copy, and some metadata.

A version control system provides several useful features that can allow the users to track and control changes made to the data over time. Such features include operations like commit, update, branch, revert, merge, and log. In practice, the most commonly used operations are commit and retrieve. Commit refers to the process of submitting the latest changes of data to the main repository, so that the changes to the working copy become permanent. Retrieve refers to the process of replacing the working copy with an older or a newer version stored on the server.

Version control systems using delta encoding. A version control system keeps track of all the changes made to the data over time. In this way, any version of the data can be retrieved if necessary. A key issue here is how to store and organize all those changes in the VCS repository. A straightforward approach could be simply storing each individual data version upon a commit. This simple approach was adopted by CVS [3] when storing binary files. A significant disadvantage of this approach is the large bandwidth and storage space it requires for committing a file version, especially when the file size is large.

By observing that there is always a large amount of duplicate content between each file version and its subsequent file version, modern version control systems adopt “delta encoding” to reduce the storage space being needed. Using delta decoding, a version control system only stores the first version of a file in its entirety, and for each subsequent version of the file, the VCS only stores the difference between this file version and its immediate previous version. All the differences are recorded in discrete files called “deltas.”

Therefore, if there are t file versions in total, the VCS server will store them as the initial file and 
?
-
1
 deltas (see Fig. 17.1). Popular version control systems that use variants of delta encoding include CVS [3], SVN [14], and Git [8]. The delta encoding can significantly reduce the storage space required to store all the file versions. However, it suffers from an expensive retrieval: To retrieve the file version t, the VCS server needs to start from the initial file version and apply all the subsequent deltas up to version t, incurring a cost linear in t (see Fig. 17.1). Considering that source code repositories may have a large number of file versions (e.g., GCC has more than 200,000 versions in its repository [7]), retrieving an arbitrary file version may bring a significant burden to the VCS server.

Figure 17.1
Sign in to download full-size image
Figure 17.1. A delta-based version control system

Version control systems using skip delta encoding. As a special type of delta encoding, the skip delta encoding is designed to further optimize the retrieval cost. Apache Subversion (SVN [14]) is a popular version control system that adopts this type of delta encoding. In skip delta encoding, each new file version is still stored as the difference between it and a previous file version. The main difference between the skip delta encoding and the delta encoding is that this previous file version is not necessarily the immediate previous version. Instead, it can be an arbitrary file version from the initial file version up to the immediate previous file version. This ensures that retrieval of an arbitrary file version t requires significantly less than t applications of deltas by the version control server. In this case, the difference is called a “skip delta” and the old version against which a new version is encoded is called a “skip version.”

In particular, if we select the skip version based on the following rule, the complexity for retrieving an arbitrary file version t will be 
O
(
log
?
(
?
)
)
, i.e., we only need to apply at most 
log
?
(
?
)
 skip deltas in order to recompute the desired file version t starting from the initial file version. Let version j be the skip version of version i. The rule for selecting the skip version j is: Based on the binary representation of i, we change the rightmost bit that has value “1” into a bit with value “0”. For example, in Fig. 17.2, version 3's skip version is version 2. This is because the binary representation of 3 is 011, and by changing the rightmost “1” bit into a “0” bit, we can obtain 2.

Figure 17.2
Sign in to download full-size image
Figure 17.2. A skip delta-based version control system

By using the skip delta encoding, the cost for recovering an arbitrary file version will be logarithmic in the total number of versions. For example, in Fig. 17.2, to reconstruct version 3, we can start from version 0 and apply 
?
2
 and 
?
3
; to reconstruct version 4, we can start from version 0 and apply 
?
4
. The skip version for version 25 is 24, whose skip version is 16, whose skip version is 0. Thus, to reconstruct version 25, we can start from version 0 and apply 
?
16
, 
?
24
, and 
?
25
. We prove that the cost for retrieving an arbitrary file version t is bounded by 
O
(
log
?
(
?
)
)
 [24].
