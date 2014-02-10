'                                __
'        ,    This program     ," e`--o
'       ((     was written    (  | __,'
'        \\~——————————————————'\_;/
'        (   by JOSH STODOLA    /
'        /) .———————————————.  )
'       (( (               (( (
'        ``-'               ``-'
'
'            Date: 08/20/05


#Region "  Please do not alter this code.  "

Public Class Form2
    Inherits System.Windows.Forms.Form

#Region "  Form Level Variables  "

    Dim frmMain  'dimensioned here so it is global, but not yet instantiated
    Dim frmAbout As New Form3
    Dim strIn As String
    Dim intCounter, intInterval As Integer
    Dim blnSwitch As Boolean
    Public Shared ClassName, Extends, Listeners, Packages, BGColor, Directory As String
    Public Shared isMouse, isAction, isItem, isKey, isJFrame, isJApplet As Boolean

#End Region

#Region "  Windows Form Designer generated code  "

    Public Sub New()
        MyBase.New()

        'This call is required by the Windows Form Designer.
        InitializeComponent()

        'Add any initialization after the InitializeComponent() call

    End Sub

    'Form overrides dispose to clean up the component list.
    Protected Overloads Overrides Sub Dispose(ByVal disposing As Boolean)
        If disposing Then
            If Not (components Is Nothing) Then
                components.Dispose()
            End If
        End If
        MyBase.Dispose(disposing)
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents mnuHelpAbout As System.Windows.Forms.MenuItem
    Friend WithEvents mnuHelp As System.Windows.Forms.MenuItem
    Friend WithEvents lblProgrammer As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents txtClassName As System.Windows.Forms.TextBox
    Friend WithEvents mnuFile As System.Windows.Forms.MenuItem
    Friend WithEvents mnuFileExit As System.Windows.Forms.MenuItem
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents radJFrame As System.Windows.Forms.RadioButton
    Friend WithEvents radJApplet As System.Windows.Forms.RadioButton
    Friend WithEvents GroupBox2 As System.Windows.Forms.GroupBox
    Friend WithEvents chkJavaText As System.Windows.Forms.CheckBox
    Friend WithEvents chkJavaxSwing As System.Windows.Forms.CheckBox
    Friend WithEvents chkJavaAWTEvent As System.Windows.Forms.CheckBox
    Friend WithEvents chkJavaAWT As System.Windows.Forms.CheckBox
    Friend WithEvents chkJavaIO As System.Windows.Forms.CheckBox
    Friend WithEvents GroupBox3 As System.Windows.Forms.GroupBox
    Friend WithEvents btnGenerate As System.Windows.Forms.Button
    Friend WithEvents MenuItem1 As System.Windows.Forms.MenuItem
    Friend WithEvents mnuFileReset As System.Windows.Forms.MenuItem
    Friend WithEvents chkAction As System.Windows.Forms.CheckBox
    Friend WithEvents chkItem As System.Windows.Forms.CheckBox
    Friend WithEvents chkMouse As System.Windows.Forms.CheckBox
    Friend WithEvents Panel1 As System.Windows.Forms.Panel
    Friend WithEvents cboColor As System.Windows.Forms.ComboBox
    Friend WithEvents GroupBox4 As System.Windows.Forms.GroupBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents fbdFolder As System.Windows.Forms.FolderBrowserDialog
    Friend WithEvents MenuItem3 As System.Windows.Forms.MenuItem
    Friend WithEvents mnuMainMenu As System.Windows.Forms.MainMenu
    Friend WithEvents tmrCapsWave As System.Windows.Forms.Timer
    Friend WithEvents chkKey As System.Windows.Forms.CheckBox
    Friend WithEvents mnuFileSetDirectory As System.Windows.Forms.MenuItem
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container
        Dim resources As System.Resources.ResourceManager = New System.Resources.ResourceManager(GetType(Form2))
        Me.Label3 = New System.Windows.Forms.Label
        Me.mnuHelpAbout = New System.Windows.Forms.MenuItem
        Me.mnuHelp = New System.Windows.Forms.MenuItem
        Me.mnuFileSetDirectory = New System.Windows.Forms.MenuItem
        Me.lblProgrammer = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.txtClassName = New System.Windows.Forms.TextBox
        Me.mnuMainMenu = New System.Windows.Forms.MainMenu
        Me.mnuFile = New System.Windows.Forms.MenuItem
        Me.MenuItem3 = New System.Windows.Forms.MenuItem
        Me.mnuFileReset = New System.Windows.Forms.MenuItem
        Me.MenuItem1 = New System.Windows.Forms.MenuItem
        Me.mnuFileExit = New System.Windows.Forms.MenuItem
        Me.Label1 = New System.Windows.Forms.Label
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.radJFrame = New System.Windows.Forms.RadioButton
        Me.radJApplet = New System.Windows.Forms.RadioButton
        Me.GroupBox2 = New System.Windows.Forms.GroupBox
        Me.chkJavaText = New System.Windows.Forms.CheckBox
        Me.chkJavaxSwing = New System.Windows.Forms.CheckBox
        Me.chkJavaAWTEvent = New System.Windows.Forms.CheckBox
        Me.chkJavaAWT = New System.Windows.Forms.CheckBox
        Me.chkJavaIO = New System.Windows.Forms.CheckBox
        Me.tmrCapsWave = New System.Windows.Forms.Timer(Me.components)
        Me.GroupBox3 = New System.Windows.Forms.GroupBox
        Me.chkKey = New System.Windows.Forms.CheckBox
        Me.chkMouse = New System.Windows.Forms.CheckBox
        Me.chkItem = New System.Windows.Forms.CheckBox
        Me.chkAction = New System.Windows.Forms.CheckBox
        Me.btnGenerate = New System.Windows.Forms.Button
        Me.Panel1 = New System.Windows.Forms.Panel
        Me.cboColor = New System.Windows.Forms.ComboBox
        Me.GroupBox4 = New System.Windows.Forms.GroupBox
        Me.Label4 = New System.Windows.Forms.Label
        Me.fbdFolder = New System.Windows.Forms.FolderBrowserDialog
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.GroupBox4.SuspendLayout()
        Me.SuspendLayout()
        '
        'Label3
        '
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 6.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label3.ForeColor = System.Drawing.SystemColors.ActiveCaption
        Me.Label3.Location = New System.Drawing.Point(0, 250)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(408, 11)
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "IF THIS IS YOUR FIRST TIME,     CHECK OUT   HELP | ABOUT"
        Me.Label3.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'mnuHelpAbout
        '
        Me.mnuHelpAbout.Index = 0
        Me.mnuHelpAbout.Text = "&About"
        '
        'mnuHelp
        '
        Me.mnuHelp.Index = 1
        Me.mnuHelp.MenuItems.AddRange(New System.Windows.Forms.MenuItem() {Me.mnuHelpAbout})
        Me.mnuHelp.Text = "&Help"
        '
        'mnuFileSetDirectory
        '
        Me.mnuFileSetDirectory.Index = 0
        Me.mnuFileSetDirectory.Text = "Set &Directory"
        '
        'lblProgrammer
        '
        Me.lblProgrammer.Font = New System.Drawing.Font("MS Reference Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblProgrammer.Location = New System.Drawing.Point(96, 260)
        Me.lblProgrammer.Name = "lblProgrammer"
        Me.lblProgrammer.Size = New System.Drawing.Size(216, 16)
        Me.lblProgrammer.TabIndex = 8
        Me.lblProgrammer.Text = "programmed by josh stodola"
        Me.lblProgrammer.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'Label2
        '
        Me.Label2.Location = New System.Drawing.Point(12, 8)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(120, 16)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "&Name of your Class:"
        '
        'txtClassName
        '
        Me.txtClassName.Location = New System.Drawing.Point(20, 24)
        Me.txtClassName.MaxLength = 32
        Me.txtClassName.Name = "txtClassName"
        Me.txtClassName.Size = New System.Drawing.Size(136, 20)
        Me.txtClassName.TabIndex = 1
        Me.txtClassName.Text = ""
        Me.txtClassName.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'mnuMainMenu
        '
        Me.mnuMainMenu.MenuItems.AddRange(New System.Windows.Forms.MenuItem() {Me.mnuFile, Me.mnuHelp})
        '
        'mnuFile
        '
        Me.mnuFile.Index = 0
        Me.mnuFile.MenuItems.AddRange(New System.Windows.Forms.MenuItem() {Me.mnuFileSetDirectory, Me.MenuItem3, Me.mnuFileReset, Me.MenuItem1, Me.mnuFileExit})
        Me.mnuFile.Text = "&File"
        '
        'MenuItem3
        '
        Me.MenuItem3.Index = 1
        Me.MenuItem3.Text = "-"
        '
        'mnuFileReset
        '
        Me.mnuFileReset.Index = 2
        Me.mnuFileReset.Text = "&Reset Fields"
        '
        'MenuItem1
        '
        Me.MenuItem1.Index = 3
        Me.MenuItem1.Text = "-"
        '
        'mnuFileExit
        '
        Me.mnuFileExit.Index = 4
        Me.mnuFileExit.Text = "E&xit"
        '
        'Label1
        '
        Me.Label1.Location = New System.Drawing.Point(156, 32)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(32, 16)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = ".java"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.radJFrame)
        Me.GroupBox1.Controls.Add(Me.radJApplet)
        Me.GroupBox1.Location = New System.Drawing.Point(212, 8)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(184, 40)
        Me.GroupBox1.TabIndex = 2
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Please choose a &Parent"
        '
        'radJFrame
        '
        Me.radJFrame.Location = New System.Drawing.Point(96, 16)
        Me.radJFrame.Name = "radJFrame"
        Me.radJFrame.Size = New System.Drawing.Size(72, 16)
        Me.radJFrame.TabIndex = 1
        Me.radJFrame.Text = "JFrame"
        '
        'radJApplet
        '
        Me.radJApplet.Location = New System.Drawing.Point(24, 16)
        Me.radJApplet.Name = "radJApplet"
        Me.radJApplet.Size = New System.Drawing.Size(72, 16)
        Me.radJApplet.TabIndex = 2
        Me.radJApplet.Text = "JApplet"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.chkJavaText)
        Me.GroupBox2.Controls.Add(Me.chkJavaxSwing)
        Me.GroupBox2.Controls.Add(Me.chkJavaAWTEvent)
        Me.GroupBox2.Controls.Add(Me.chkJavaAWT)
        Me.GroupBox2.Controls.Add(Me.chkJavaIO)
        Me.GroupBox2.Location = New System.Drawing.Point(212, 64)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(184, 104)
        Me.GroupBox2.TabIndex = 4
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Please choose your &Package(s)"
        '
        'chkJavaText
        '
        Me.chkJavaText.Location = New System.Drawing.Point(24, 64)
        Me.chkJavaText.Name = "chkJavaText"
        Me.chkJavaText.Size = New System.Drawing.Size(144, 16)
        Me.chkJavaText.TabIndex = 3
        Me.chkJavaText.Text = "import  java.text.*;"
        '
        'chkJavaxSwing
        '
        Me.chkJavaxSwing.Checked = True
        Me.chkJavaxSwing.CheckState = System.Windows.Forms.CheckState.Checked
        Me.chkJavaxSwing.Location = New System.Drawing.Point(24, 80)
        Me.chkJavaxSwing.Name = "chkJavaxSwing"
        Me.chkJavaxSwing.Size = New System.Drawing.Size(144, 16)
        Me.chkJavaxSwing.TabIndex = 4
        Me.chkJavaxSwing.Text = "import  javax.swing.*;"
        '
        'chkJavaAWTEvent
        '
        Me.chkJavaAWTEvent.Location = New System.Drawing.Point(24, 48)
        Me.chkJavaAWTEvent.Name = "chkJavaAWTEvent"
        Me.chkJavaAWTEvent.Size = New System.Drawing.Size(144, 16)
        Me.chkJavaAWTEvent.TabIndex = 2
        Me.chkJavaAWTEvent.Text = "import  java.awt.event.*"
        '
        'chkJavaAWT
        '
        Me.chkJavaAWT.Location = New System.Drawing.Point(24, 32)
        Me.chkJavaAWT.Name = "chkJavaAWT"
        Me.chkJavaAWT.Size = New System.Drawing.Size(144, 16)
        Me.chkJavaAWT.TabIndex = 1
        Me.chkJavaAWT.Text = "import  java.awt.*;"
        '
        'chkJavaIO
        '
        Me.chkJavaIO.Location = New System.Drawing.Point(24, 16)
        Me.chkJavaIO.Name = "chkJavaIO"
        Me.chkJavaIO.Size = New System.Drawing.Size(144, 16)
        Me.chkJavaIO.TabIndex = 0
        Me.chkJavaIO.Text = "import  java.io.*;"
        '
        'tmrCapsWave
        '
        Me.tmrCapsWave.Enabled = True
        Me.tmrCapsWave.Interval = 220
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.chkKey)
        Me.GroupBox3.Controls.Add(Me.chkMouse)
        Me.GroupBox3.Controls.Add(Me.chkItem)
        Me.GroupBox3.Controls.Add(Me.chkAction)
        Me.GroupBox3.Location = New System.Drawing.Point(12, 64)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(176, 104)
        Me.GroupBox3.TabIndex = 3
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Please choose an &Interface"
        '
        'chkKey
        '
        Me.chkKey.Location = New System.Drawing.Point(32, 80)
        Me.chkKey.Name = "chkKey"
        Me.chkKey.Size = New System.Drawing.Size(112, 16)
        Me.chkKey.TabIndex = 3
        Me.chkKey.Text = "KeyListener"
        '
        'chkMouse
        '
        Me.chkMouse.Location = New System.Drawing.Point(32, 60)
        Me.chkMouse.Name = "chkMouse"
        Me.chkMouse.Size = New System.Drawing.Size(112, 16)
        Me.chkMouse.TabIndex = 2
        Me.chkMouse.Text = "MouseListener"
        '
        'chkItem
        '
        Me.chkItem.Location = New System.Drawing.Point(32, 40)
        Me.chkItem.Name = "chkItem"
        Me.chkItem.Size = New System.Drawing.Size(112, 16)
        Me.chkItem.TabIndex = 1
        Me.chkItem.Text = "ItemListener"
        '
        'chkAction
        '
        Me.chkAction.Location = New System.Drawing.Point(32, 20)
        Me.chkAction.Name = "chkAction"
        Me.chkAction.Size = New System.Drawing.Size(112, 16)
        Me.chkAction.TabIndex = 0
        Me.chkAction.Text = "ActionListener"
        '
        'btnGenerate
        '
        Me.btnGenerate.BackColor = System.Drawing.SystemColors.Control
        Me.btnGenerate.Location = New System.Drawing.Point(240, 192)
        Me.btnGenerate.Name = "btnGenerate"
        Me.btnGenerate.Size = New System.Drawing.Size(128, 32)
        Me.btnGenerate.TabIndex = 6
        Me.btnGenerate.Text = "&Generate"
        '
        'Panel1
        '
        Me.Panel1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.Panel1.Location = New System.Drawing.Point(24, 25)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(24, 19)
        Me.Panel1.TabIndex = 1
        '
        'cboColor
        '
        Me.cboColor.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cboColor.Items.AddRange(New Object() {"White", "Black", "Red", "Orange", "Yellow", "Green", "Blue", "Pink", "Gray"})
        Me.cboColor.Location = New System.Drawing.Point(56, 24)
        Me.cboColor.Name = "cboColor"
        Me.cboColor.Size = New System.Drawing.Size(96, 21)
        Me.cboColor.TabIndex = 0
        '
        'GroupBox4
        '
        Me.GroupBox4.Controls.Add(Me.Panel1)
        Me.GroupBox4.Controls.Add(Me.cboColor)
        Me.GroupBox4.Location = New System.Drawing.Point(12, 176)
        Me.GroupBox4.Name = "GroupBox4"
        Me.GroupBox4.Size = New System.Drawing.Size(176, 56)
        Me.GroupBox4.TabIndex = 5
        Me.GroupBox4.TabStop = False
        Me.GroupBox4.Text = "Choose Background &Color:"
        '
        'Label4
        '
        Me.Label4.BackColor = System.Drawing.SystemColors.ControlDark
        Me.Label4.Location = New System.Drawing.Point(0, 248)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(408, 1)
        Me.Label4.TabIndex = 7
        '
        'Form2
        '
        Me.AcceptButton = Me.btnGenerate
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.BackColor = System.Drawing.SystemColors.Control
        Me.ClientSize = New System.Drawing.Size(408, 275)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.GroupBox4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.txtClassName)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.btnGenerate)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.lblProgrammer)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Location = New System.Drawing.Point(305, 236)
        Me.MaximizeBox = False
        Me.Menu = Me.mnuMainMenu
        Me.MinimizeBox = False
        Me.Name = "Form2"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.Manual
        Me.Text = "JAVA GUI AID"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox4.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

#End Region

#Region "  CAPS WAVE v1.0  "
    ' - - - - - - - - - - - - - - -'
    '        CAPS WAVE v1.0        '
    '          written by          '
    '         JOSH STODOLA         '
    '           08/28/05           '
    '- - - - - - - - - - - - - - - '
    ' Cycles through a label and   '
    ' converts its case to upper   '
    ' and lower case one letter at '
    ' a time.  Spaces are ignored. '
    ' - - - - - - - - - - - - - - -'
    ' Label text should be in all  '
    ' lower case to begin with.    '
    '- - - - - - - - - - - - - - - '
    Private Sub tmrCapsWave_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles tmrCapsWave.Tick

        

        Dim strNew, charIn, strSpaceCheck As String

        strIn = CStr(lblProgrammer.Text) ' this is the label to be "manipulated"

        ' blnSwitch determines whether or not the text needs to  
        ' be converted to upper case or lower case
        If intInterval = strIn.Length Then
            blnSwitch = True
        ElseIf intInterval >= strIn.Length * 2 Then
            blnSwitch = False
            intInterval = 0     'intInterval is the number of times the timer has ticked
        End If

        If intCounter >= CInt(strIn.Length) Then
            intCounter = 0
        End If

        strNew = strIn.Remove(intCounter, 1)
        strSpaceCheck = strIn.Chars(intCounter)

        If strSpaceCheck = " " Then
            charIn = strIn.Chars(intCounter + 1)
            strNew = strIn.Remove((intCounter + 1), 1)
            intCounter += 1
            intInterval += 1
        Else
            charIn = strIn.Chars(intCounter)
        End If

        If Not blnSwitch Then
            strNew = strNew.Insert(intCounter, charIn.ToUpper())
        Else
            strNew = strNew.Insert(intCounter, charIn.ToLower())
        End If

        'display results in same label that we got the string from
        lblProgrammer.Text = strNew

        'increment counters
        intCounter += 1
        intInterval += 1
    End Sub
#End Region

#Region "  Form Load  "
    Private Sub Form2_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        txtClassName.Focus()
        radJFrame.Checked = True
        Directory = Application.StartupPath
        Panel1.BackColor = Color.White
        cboColor.SelectedIndex = 0
        frmMain = New Form1
    End Sub
#End Region

#Region "  Generate Button  "
    Public Sub btnGenerate_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnGenerate.Click
        If txtClassName.Text = "" Or txtClassName.Text.Replace(" ", "") = "" Then
            MessageBox.Show("Do not leave class name field blank!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error)
            txtClassName.Focus()
            txtClassName.SelectAll()
        Else
            ClassName = CStr(txtClassName.Text.Replace(" ", ""))

            If radJApplet.Checked = False And radJFrame.Checked = False Then
                MessageBox.Show("Please choose an interface!", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error)
                radJFrame.Focus()
            Else

                If radJFrame.Checked Then
                    Extends = "JFrame"
                    isJFrame = True
                    isJApplet = False
                Else
                    Extends = "JApplet"
                    isJApplet = True
                    isJFrame = False
                End If


                If chkMouse.Checked = False And chkAction.Checked = False And chkItem.Checked = False And chkKey.Checked = False Then
                    Listeners = "null"
                Else
                    prepareImplements(chkAction, chkItem, chkMouse, chkKey)
                End If

                If chkJavaIO.Checked Then
                    Packages += "import java.io.*;" & vbCrLf
                End If
                If chkJavaAWT.Checked Then
                    Packages += "import java.awt.*;" & vbCrLf
                End If
                If chkJavaAWTEvent.Checked Then
                    Packages += "import java.awt.event.*;" & vbCrLf
                End If
                If chkJavaText.Checked Then
                    Packages += "import java.text.*;" & vbCrLf
                End If
                If chkJavaxSwing.Checked Then
                    Packages += "import javax.swing.*;" & vbCrLf
                End If

                frmMain.Form1_Load(sender, e)

                Dim frmFileCreated As New Form4

                frmFileCreated.SetDirectory(Directory & "\" & ClassName & ".java")
                frmFileCreated.Location = New System.Drawing.Point(Me.Location.X + 50, Me.Location.Y + 29)
                frmFileCreated.ShowDialog()

                '**********OLD CONFIRMATION MESSAGE BOX**************************
                'MessageBox.Show(vbCrLf & "           FILE CREATED SUCCESSFULLY!" & vbCrLf & vbCrLf & _
                '               "Filename:  " & ClassName & ".java" & vbCrLf & _
                '              "Directory:  " & Directory & vbCrLf & vbCrLf & "           Click OK to close" & vbCrLf, "File Created!", MessageBoxButtons.OK)

                Close()
            End If
        End If
    End Sub
#End Region

#Region "  Parent Radio Buttons  "
    Private Sub radJFrame_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radJFrame.CheckedChanged
        chkJavaAWT.Checked = True
    End Sub
    Private Sub radJApplet_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles radJApplet.CheckedChanged
        chkJavaAWT.Checked = True
    End Sub
#End Region

#Region "  All Menu Code  "

    Private Sub mnuFileReset_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles mnuFileReset.Click
        radJApplet.Checked = False
        radJFrame.Checked = False
        chkAction.Checked = False
        chkItem.Checked = False
        chkMouse.Checked = False
        chkJavaIO.Checked = False
        chkJavaAWT.Checked = False
        chkJavaAWTEvent.Checked = False
        chkJavaText.Checked = False
        chkJavaxSwing.Checked = True
        txtClassName.Focus()
        txtClassName.SelectAll()
    End Sub
    Private Sub mnuFileExit_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles mnuFileExit.Click
        Dim drgResult As DialogResult = MessageBox.Show("      Exit without creating file?", "Exit?", MessageBoxButtons.YesNo)
        If drgResult = DialogResult.Yes Then
            Me.Close()
            frmMain.close()
        Else
            txtClassName.Focus()
        End If
    End Sub
    Private Sub mnuFileSetDirectory_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles mnuFileSetDirectory.Click, txtClassName.DoubleClick
        fbdFolder.SelectedPath = Directory
        fbdFolder.Description = "Choose a directory for the files created by JAVA GUI AID." & vbCrLf & vbCrLf & Directory
        fbdFolder.ShowDialog()
        Directory = fbdFolder.SelectedPath
    End Sub
    Private Sub mnuHelpAbout_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles mnuHelpAbout.Click
        frmAbout.Hide()
        frmAbout.Location = New System.Drawing.Point(Me.Location.X - 10, Me.Location.Y - 25)
        Try
            frmAbout.Show()
        Catch ex As ObjectDisposedException
            frmAbout = New Form3
            mnuHelpAbout_Click(sender, e)
        End Try
    End Sub

#End Region

#Region "  Interface Checkboxes  "
    Private Sub chkAction_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles chkAction.CheckedChanged
        If chkAction.Checked Then
            isAction = True
            chkJavaAWTEvent.Checked = True
        Else
            isAction = False
            If chkMouse.Checked = False And chkItem.Checked = False And chkKey.Checked = False Then
                chkJavaAWTEvent.Checked = False
            End If
        End If
    End Sub

    Private Sub chkItem_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles chkItem.CheckedChanged
        If chkItem.Checked Then
            isItem = True
            chkJavaAWTEvent.Checked = True
        Else
            isItem = False
            If chkMouse.Checked = False And chkAction.Checked = False And chkKey.Checked = False Then
                chkJavaAWTEvent.Checked = False
            End If
        End If
    End Sub

    Private Sub chkMouse_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles chkMouse.CheckedChanged
        If chkMouse.Checked Then
            isMouse = True
            chkJavaAWTEvent.Checked = True
        Else
            isMouse = False
            If chkAction.Checked = False And chkItem.Checked = False And chkKey.Checked = False Then
                chkJavaAWTEvent.Checked = False
            End If
        End If
    End Sub

    Private Sub chkKey_CheckedChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles chkKey.CheckedChanged
        If chkKey.Checked Then
            isKey = True
            chkJavaAWTEvent.Checked = True
        Else
            isKey = False
            If chkAction.Checked = False And chkItem.Checked = False And chkKey.Checked = False Then
                chkJavaAWTEvent.Checked = False
            End If
        End If
    End Sub
#End Region

#Region "  Class Name Correction  "

    'This method will ensure the class name meets JAVA's restrictions for naming classes
    Private Sub txtClassName_Leave(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtClassName.Leave

        'Remove illegal characters from textbox before trying to alter its contents
        txtClassName.Text = txtClassName.Text.Replace(" ", "")
        txtClassName.Text = txtClassName.Text.Replace("!", "")
        txtClassName.Text = txtClassName.Text.Replace("@", "")
        txtClassName.Text = txtClassName.Text.Replace("#", "")
        txtClassName.Text = txtClassName.Text.Replace("%", "")
        txtClassName.Text = txtClassName.Text.Replace("&", "")
        txtClassName.Text = txtClassName.Text.Replace("*", "")
        txtClassName.Text = txtClassName.Text.Replace("(", "")
        txtClassName.Text = txtClassName.Text.Replace(")", "")
        txtClassName.Text = txtClassName.Text.Replace("+", "")
        txtClassName.Text = txtClassName.Text.Replace("-", "")
        txtClassName.Text = txtClassName.Text.Replace("?", "")
        txtClassName.Text = txtClassName.Text.Replace(";", "")
        txtClassName.Text = txtClassName.Text.Replace(":", "")
        txtClassName.Text = txtClassName.Text.Replace("~", "")
        txtClassName.Text = txtClassName.Text.Replace("`", "")
        txtClassName.Text = txtClassName.Text.Replace("<", "")
        txtClassName.Text = txtClassName.Text.Replace(">", "")
        txtClassName.Text = txtClassName.Text.Replace("\", "")
        txtClassName.Text = txtClassName.Text.Replace("|", "")
        txtClassName.Text = txtClassName.Text.Replace("=", "")
        txtClassName.Text = txtClassName.Text.Replace("{", "")
        txtClassName.Text = txtClassName.Text.Replace("}", "")
        txtClassName.Text = txtClassName.Text.Replace("[", "")
        txtClassName.Text = txtClassName.Text.Replace("]", "")
        txtClassName.Text = txtClassName.Text.Replace(",", "")
        txtClassName.Text = txtClassName.Text.Replace(".", "")
        txtClassName.Text = txtClassName.Text.Replace("/", "")
        txtClassName.Text = txtClassName.Text.Replace("'", "")
        txtClassName.Text = txtClassName.Text.Replace("""", "")

        If txtClassName.Text <> "" Then
            Dim ch As String

            'Class name cannot begin with a number.
            ch = txtClassName.Text.Chars(0)
            If IsNumeric(ch) Then
                txtClassName.Text = txtClassName.Text.TrimStart(ch)
                'cycle back to the top of this method just in case there is
                'more than one numeric digit in the front
                txtClassName_Leave(sender, e)
            End If

            'Convert first letter to uppercase and store it in a char variable
            ch = txtClassName.Text.Chars(0).ToUpper(txtClassName.Text.Chars(0))
            'Remove the first character from textbox
            txtClassName.Text = txtClassName.Text.Remove(0, 1)
            'Replace with new char variable
            txtClassName.Text = ch & txtClassName.Text
        End If
    End Sub

#End Region

#Region "  Color Combo Box  "
    Private Sub cboColor_SelectedIndexChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles cboColor.SelectedIndexChanged
        Select Case cboColor.SelectedIndex
            Case "0"
                Panel1.BackColor = Color.White
                BGColor = "Color.white);"
            Case "1"
                Panel1.BackColor = Color.Black
                BGColor = "Color.black);"
            Case "2"
                Panel1.BackColor = Color.Red
                BGColor = "Color.red);"
            Case "3"
                Panel1.BackColor = Color.Orange
                BGColor = "Color.orange);"
            Case "4"
                Panel1.BackColor = Color.Yellow
                BGColor = "Color.yellow);"
            Case "5"
                Panel1.BackColor = Color.Green
                BGColor = "Color.green.darker());"
            Case "6"
                Panel1.BackColor = Color.Blue
                BGColor = "Color.blue);"
            Case "7"
                Panel1.BackColor = Color.Pink
                BGColor = "Color.pink);"
            Case "8"
                Panel1.BackColor = Color.Gray
                BGColor = "Color.gray);"
            Case Else
                Panel1.BackColor = Color.FromKnownColor(KnownColor.Control)
                BGColor = ""
        End Select
    End Sub
#End Region

#Region "  Interface Preparation Method  "
    Private Sub prepareImplements(ByVal a As CheckBox, ByVal b As CheckBox, ByVal c As CheckBox, ByVal d As CheckBox)
        If a.Checked Then
            If b.Checked Or c.Checked Or d.Checked Then
                Listeners = a.Text
            Else
                Listeners = a.Text
            End If
        End If
        If b.Checked Then
            If a.Checked Then
                Listeners += ", " & b.Text
            Else
                Listeners = b.Text
            End If
        End If
        If c.Checked Then
            If a.Checked Or b.Checked Then
                Listeners += ", " & c.Text
            Else
                Listeners = c.Text
            End If
        End If
        If d.Checked Then
            If a.Checked Or b.Checked Or c.Checked Then
                Listeners += ", " & d.Text
            Else
                Listeners = d.Text
            End If
        End If
    End Sub
#End Region

End Class

#End Region
