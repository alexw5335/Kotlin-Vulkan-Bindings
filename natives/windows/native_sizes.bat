gcc -shared src/main/c/common/native_sizes.c ^
 -o "natives/windows/native_sizes.dll" ^
 -I "%JAVA_HOME%\include" ^
 -I "%JAVA_HOME%\include\win32"