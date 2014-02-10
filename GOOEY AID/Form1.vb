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

Public Class Form1
    Inherits System.Windows.Forms.Form

#Region "  Josh's Structure  "

    Structure Josh
        Dim PositionX As Integer
        Dim PositionY As Integer
        Dim Width As Integer
        Dim Height As Integer
        Dim Name As String
        Dim NeedsColor As Boolean
        Dim IsValid As Boolean
    End Structure

#End Region

#Region "  Global Variables  "

    ' This array is crucial to the program's success
    Dim array(250) As Josh
    ' 250 is the max number of controls possible on the form

    Dim datOut, datHTML As System.IO.StreamWriter
    Dim frmMinor As New Form2
    Dim ItemsToBeSorted As New ComboBox

#End Region

#Region " Windows Form Designer generated code "

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
    Friend WithEvents lblName As System.Windows.Forms.Label
    Friend WithEvents lblPhoneNum As System.Windows.Forms.Label
    Friend WithEvents lblReservationDate As System.Windows.Forms.Label
    Friend WithEvents lblCCType As System.Windows.Forms.Label
    Friend WithEvents lblCCN As System.Windows.Forms.Label
    Friend WithEvents lblNumNights As System.Windows.Forms.Label
    Friend WithEvents txtName As System.Windows.Forms.TextBox
    Friend WithEvents txtPhone As System.Windows.Forms.TextBox
    Friend WithEvents cboReservationDate As System.Windows.Forms.ComboBox
    Friend WithEvents cboCCType As System.Windows.Forms.ComboBox
    Friend WithEvents txtCCN As System.Windows.Forms.TextBox
    Friend WithEvents txtNumNights As System.Windows.Forms.TextBox
    Friend WithEvents btnEnter As System.Windows.Forms.Button
    Friend WithEvents btnClear As System.Windows.Forms.Button
    Friend WithEvents lblSample As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Dim resources As System.Resources.ResourceManager = New System.Resources.ResourceManager(GetType(Form1))
        Me.lblName = New System.Windows.Forms.Label
        Me.lblPhoneNum = New System.Windows.Forms.Label
        Me.lblReservationDate = New System.Windows.Forms.Label
        Me.lblCCType = New System.Windows.Forms.Label
        Me.lblCCN = New System.Windows.Forms.Label
        Me.lblNumNights = New System.Windows.Forms.Label
        Me.txtName = New System.Windows.Forms.TextBox
        Me.txtPhone = New System.Windows.Forms.TextBox
        Me.cboReservationDate = New System.Windows.Forms.ComboBox
        Me.cboCCType = New System.Windows.Forms.ComboBox
        Me.txtCCN = New System.Windows.Forms.TextBox
        Me.txtNumNights = New System.Windows.Forms.TextBox
        Me.btnEnter = New System.Windows.Forms.Button
        Me.btnClear = New System.Windows.Forms.Button
        Me.lblSample = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'lblName
        '
        Me.lblName.Location = New System.Drawing.Point(104, 110)
        Me.lblName.Name = "lblName"
        Me.lblName.Size = New System.Drawing.Size(128, 16)
        Me.lblName.TabIndex = 1
        Me.lblName.Text = "Name:"
        '
        'lblPhoneNum
        '
        Me.lblPhoneNum.Location = New System.Drawing.Point(104, 144)
        Me.lblPhoneNum.Name = "lblPhoneNum"
        Me.lblPhoneNum.Size = New System.Drawing.Size(128, 16)
        Me.lblPhoneNum.TabIndex = 2
        Me.lblPhoneNum.Text = "Phone Number"
        '
        'lblReservationDate
        '
        Me.lblReservationDate.Location = New System.Drawing.Point(104, 176)
        Me.lblReservationDate.Name = "lblReservationDate"
        Me.lblReservationDate.Size = New System.Drawing.Size(128, 16)
        Me.lblReservationDate.TabIndex = 3
        Me.lblReservationDate.Text = "Date of Reservation:"
        '
        'lblCCType
        '
        Me.lblCCType.Location = New System.Drawing.Point(104, 208)
        Me.lblCCType.Name = "lblCCType"
        Me.lblCCType.Size = New System.Drawing.Size(128, 16)
        Me.lblCCType.TabIndex = 4
        Me.lblCCType.Text = "Credit Card Type:"
        '
        'lblCCN
        '
        Me.lblCCN.Location = New System.Drawing.Point(104, 240)
        Me.lblCCN.Name = "lblCCN"
        Me.lblCCN.Size = New System.Drawing.Size(128, 16)
        Me.lblCCN.TabIndex = 5
        Me.lblCCN.Text = "Credit Card Number:"
        '
        'lblNumNights
        '
        Me.lblNumNights.Location = New System.Drawing.Point(104, 272)
        Me.lblNumNights.Name = "lblNumNights"
        Me.lblNumNights.Size = New System.Drawing.Size(128, 16)
        Me.lblNumNights.TabIndex = 6
        Me.lblNumNights.Text = "Number of Nights:"
        '
        'txtName
        '
        Me.txtName.Location = New System.Drawing.Point(232, 104)
        Me.txtName.Name = "txtName"
        Me.txtName.Size = New System.Drawing.Size(144, 21)
        Me.txtName.TabIndex = 7
        Me.txtName.Text = ""
        '
        'txtPhone
        '
        Me.txtPhone.Location = New System.Drawing.Point(232, 136)
        Me.txtPhone.Name = "txtPhone"
        Me.txtPhone.Size = New System.Drawing.Size(144, 21)
        Me.txtPhone.TabIndex = 8
        Me.txtPhone.Text = ""
        '
        'cboReservationDate
        '
        Me.cboReservationDate.Location = New System.Drawing.Point(232, 168)
        Me.cboReservationDate.Name = "cboReservationDate"
        Me.cboReservationDate.Size = New System.Drawing.Size(144, 23)
        Me.cboReservationDate.TabIndex = 9
        '
        'cboCCType
        '
        Me.cboCCType.Location = New System.Drawing.Point(232, 200)
        Me.cboCCType.Name = "cboCCType"
        Me.cboCCType.Size = New System.Drawing.Size(144, 23)
        Me.cboCCType.TabIndex = 10
        '
        'txtCCN
        '
        Me.txtCCN.Location = New System.Drawing.Point(232, 232)
        Me.txtCCN.Name = "txtCCN"
        Me.txtCCN.Size = New System.Drawing.Size(144, 21)
        Me.txtCCN.TabIndex = 11
        Me.txtCCN.Text = ""
        '
        'txtNumNights
        '
        Me.txtNumNights.Location = New System.Drawing.Point(232, 264)
        Me.txtNumNights.Name = "txtNumNights"
        Me.txtNumNights.Size = New System.Drawing.Size(64, 21)
        Me.txtNumNights.TabIndex = 12
        Me.txtNumNights.Text = ""
        '
        'btnEnter
        '
        Me.btnEnter.Location = New System.Drawing.Point(128, 312)
        Me.btnEnter.Name = "btnEnter"
        Me.btnEnter.Size = New System.Drawing.Size(104, 32)
        Me.btnEnter.TabIndex = 23
        Me.btnEnter.Text = "ENTER"
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(248, 312)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(104, 32)
        Me.btnClear.TabIndex = 24
        Me.btnClear.Text = "CLEAR"
        '
        'lblSample
        '
        Me.lblSample.Location = New System.Drawing.Point(176, 32)
        Me.lblSample.Name = "lblSample"
        Me.lblSample.Size = New System.Drawing.Size(144, 24)
        Me.lblSample.TabIndex = 25
        Me.lblSample.Text = "SAMPLE PROGRAM "
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(6, 14)
        Me.BackColor = System.Drawing.Color.White
        Me.ClientSize = New System.Drawing.Size(496, 422)
        Me.Controls.Add(Me.lblSample)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnEnter)
        Me.Controls.Add(Me.txtNumNights)
        Me.Controls.Add(Me.txtCCN)
        Me.Controls.Add(Me.cboCCType)
        Me.Controls.Add(Me.cboReservationDate)
        Me.Controls.Add(Me.txtPhone)
        Me.Controls.Add(Me.txtName)
        Me.Controls.Add(Me.lblNumNights)
        Me.Controls.Add(Me.lblCCN)
        Me.Controls.Add(Me.lblCCType)
        Me.Controls.Add(Me.lblReservationDate)
        Me.Controls.Add(Me.lblPhoneNum)
        Me.Controls.Add(Me.lblName)
        Me.Font = New System.Drawing.Font("Arial", 9.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form1"
        Me.Text = "Sample Program"
        Me.ResumeLayout(False)

    End Sub

#End Region

#Region "  Form Load  "
    Public Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        Dim intCounter As Integer

        For intCounter = 0 To Controls.Count - 1
            array(intCounter).PositionX = CInt(Controls(intCounter).Location.X)
            array(intCounter).PositionY = CInt(Controls(intCounter).Location.Y)
            array(intCounter).Width = CInt(Controls(intCounter).Width)
            array(intCounter).Height = CInt(Controls(intCounter).Height)
            array(intCounter).Name = CStr(Controls(intCounter).Name)
        Next

        WriteToFile()

        'Close()
    End Sub
#End Region

#Region "  This is where the MAGIC happens  "

    Private Sub WriteToFile()
        Dim other As Boolean
        Dim intCount As Integer
        Dim strClass, strPane, strType, strHTML, strLine, strName, strArgs, strImplements, strExtends As String
        Dim strSize As String = ".setSize("
        Dim strLocation As String = ".setLocation("

        strClass = frmMinor.ClassName
        strExtends = frmMinor.Extends
        If frmMinor.Listeners <> "null" Then
            strImplements = " implements " & frmMinor.Listeners
        Else
            strImplements = ""
        End If

        datOut = New System.IO.StreamWriter(frmMinor.Directory & "\" & strClass & ".java")

        datOut.WriteLine(frmMinor.Packages)

        datOut.WriteLine("//Created by JAVA GUI AID  (" & System.DateTime.Now & ")" & vbCrLf)

        datOut.WriteLine("public class " & strClass & " extends " & strExtends & strImplements & vbCrLf & "{")

        For intCount = 0 To Controls.Count - 1
            array(intCount).IsValid = True
            array(intCount).NeedsColor = False

            If array(intCount).Name.StartsWith("lbl") Then
                strType = "JLabel"
                strArgs = """" & Controls(intCount).Text & """"
            ElseIf array(intCount).Name.StartsWith("txt") Then
                strType = "JTextField"
                strArgs = ""
            ElseIf array(intCount).Name.StartsWith("cbo") Then
                strType = "JComboBox"
                strArgs = ""
            ElseIf array(intCount).Name.StartsWith("chk") Then
                strType = "JCheckBox"
                strArgs = """" & Controls(intCount).Text & """"
                array(intCount).NeedsColor = True
            ElseIf array(intCount).Name.StartsWith("btn") Then
                strType = "JButton"
                strArgs = """" & Controls(intCount).Text & """"
            ElseIf array(intCount).Name.StartsWith("txa") Then
                strType = "JTextArea"
                strArgs = ""
            ElseIf array(intCount).Name.StartsWith("rad") Then
                strType = "JRadioButton"
                strArgs = """" & Controls(intCount).Text & """"
                array(intCount).NeedsColor = True
            Else
                strType = "     /////// JAVA GUI AID ERROR \\\\\\\" & vbCrLf & "    //  INVALID OBJECT NAME:  " & ControlChars.Quote & Controls(intCount).Name & ControlChars.Quote & ""
                datOut.WriteLine(strType)
                other = True
                array(intCount).IsValid = False
            End If

            strLine = strType & " " & array(intCount).Name & " = new " & strType + "(" + strArgs + ");"

            If array(intCount).IsValid Then
                ItemsToBeSorted.Items.Add(strLine)
            End If

        Next

        ItemsToBeSorted.Sorted = True

        For intCount = 0 To ItemsToBeSorted.Items.Count - 1
            datOut.WriteLine("    " & ItemsToBeSorted.Items.Item(intCount))
        Next

        strLine = ""

        If frmMinor.isJFrame Then
            datOut.WriteLine(vbCrLf & "    public static void main(String[] args)throws Exception")
            datOut.WriteLine("    {" & vbCrLf & _
                      "        JFrame aFrame = new " & strClass & "();" & vbCrLf & _
                      "        aFrame.setSize(" & CStr(Me.Width) & "," + CStr(Me.Height) + ");" & vbCrLf & _
                      "        aFrame.setVisible(true);" & vbCrLf & "    }" & vbCrLf & "")
            datOut.WriteLine("    public " & strClass & "()" & vbCrLf & "    {")
            datOut.WriteLine("        super(""" + Me.Text & """);" & vbCrLf & "        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);" & vbCrLf & "")
            datOut.WriteLine("        JPanel pane = new JPanel();" & vbCrLf & "        pane.setLayout(null);")
            datOut.WriteLine("        pane.setBackground(" & frmMinor.BGColor & vbCrLf & "        setContentPane(pane);")
            strPane = "pane"
        Else
            datOut.WriteLine(vbCrLf & "    public void init()")
            datOut.WriteLine("    {" & vbCrLf & _
                      "        Container con = getContentPane();" & vbCrLf & _
                      "        con.setLayout(null);" & vbCrLf & "        con.setBackground(" & frmMinor.BGColor & vbCrLf & _
                      "        con.setSize(" & Me.Width & "," & Me.Height & ");" & vbCrLf)
            strPane = "con"
            datHTML = New System.IO.StreamWriter(frmMinor.Directory & "\" & strClass & ".html")
            datHTML.WriteLine("<HTML>" & vbCrLf & "<APPLET CODE = """ & strClass & ".class"" WIDTH = " & Me.Width & " HEIGHT = " & Me.Height & "></APPLET>" & vbCrLf & "</HTML>")
            datHTML.Close()
        End If

        For intCount = 0 To Controls.Count - 1
            If array(intCount).IsValid Then
                strName = array(intCount).Name
                strLine = "        " & strPane & ".add(" & strName & ");"
                datOut.WriteLine(vbCrLf & strLine)
                strLine = "        " & strName & strLocation & CStr(array(intCount).PositionX) + "," + CStr(array(intCount).PositionY) + ");"
                datOut.WriteLine(strLine)
                strLine = "        " & strName & strSize & CStr(array(intCount).Width) + "," + CStr(array(intCount).Height) + ");"
                datOut.WriteLine(strLine)
                If array(intCount).NeedsColor Then
                    datOut.WriteLine("        " & strName & ".setBackground(" & frmMinor.BGColor)
                End If
            End If
        Next

        datOut.WriteLine("    }")

        If frmMinor.isAction Then
            datOut.WriteLine(vbCrLf & "    /* ActionListener Method */" & vbCrLf & "    public void actionPerformed(ActionEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
        End If
        If frmMinor.isItem Then
            datOut.WriteLine(vbCrLf & "    /* ItemListener Method */" & vbCrLf & "    public void itemStateChanged(ItemEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
        End If
        If frmMinor.isMouse Then
            datOut.WriteLine(vbCrLf & "    /* MouseListener Methods */" & vbCrLf & "    public void mouseClicked(MouseEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
            datOut.WriteLine("    public void mousePressed(MouseEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
            datOut.WriteLine("    public void mouseReleased(MouseEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
            datOut.WriteLine("    public void mouseEntered(MouseEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
            datOut.WriteLine("    public void mouseExited(MouseEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
        End If
        If frmMinor.isKey Then
            datOut.WriteLine(vbCrLf & "    /* KeyListener Methods */" & vbCrLf & "    public void keyTyped(KeyEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
            datOut.WriteLine("    public void keyPressed(KeyEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
            datOut.WriteLine("    public void keyReleased(KeyEvent e)" & vbCrLf & "    {" & vbCrLf & "    }")
        End If

        datOut.WriteLine("}")

        datOut.Close()

        Close()
    End Sub

#End Region

End Class

#End Region