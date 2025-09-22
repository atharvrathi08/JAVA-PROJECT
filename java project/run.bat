@echo off
echo Running CCRM Main Application...

:: Check if bin directory exists
if not exist bin (
    echo ❌ Error: bin directory not found. Please compile first using compile.bat
    pause
    exit /b 1
)

:: Run the main class
java -cp bin edu.ccrm.Main

:: Pause to see the output
echo.
echo Program finished. Press any key to close...
pause >nul