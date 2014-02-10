Public Class Form1
    Inherits System.Windows.Forms.Form

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
    Friend WithEvents lblStudentNumber As System.Windows.Forms.Label
    Friend WithEvents lblFirstName As System.Windows.Forms.Label
    Friend WithEvents lblLastName As System.Windows.Forms.Label
    Friend WithEvents lblAddress As System.Windows.Forms.Label
    Friend WithEvents lblCity As System.Windows.Forms.Label
    Friend WithEvents lblState As System.Windows.Forms.Label
    Friend WithEvents lblDOB As System.Windows.Forms.Label
    Friend WithEvents lblNumberOfHours As System.Windows.Forms.Label
    Friend WithEvents txtFirstName As System.Windows.Forms.TextBox
    Friend WithEvents txtLastName As System.Windows.Forms.TextBox
    Friend WithEvents txtAddress As System.Windows.Forms.TextBox
    Friend WithEvents txtCity As System.Windows.Forms.TextBox
    Friend WithEvents txtState As System.Windows.Forms.TextBox
    Friend WithEvents txtDOB As System.Windows.Forms.TextBox
    Friend WithEvents txtNumberOfHours As System.Windows.Forms.TextBox
    Friend WithEvents txtStudentNumber As System.Windows.Forms.TextBox
    Friend WithEvents btnCalculate As System.Windows.Forms.Button
    Friend WithEvents lblResults As System.Windows.Forms.Label
    Friend WithEvents lblTuitionCalculator As System.Windows.Forms.Label
    <System.Diagnostics.DebuggerStepThrough()> Private Sub InitializeComponent()
        Me.lblStudentNumber = New System.Windows.Forms.Label
        Me.lblFirstName = New System.Windows.Forms.Label
        Me.lblLastName = New System.Windows.Forms.Label
        Me.lblAddress = New System.Windows.Forms.Label
        Me.lblCity = New System.Windows.Forms.Label
        Me.lblState = New System.Windows.Forms.Label
        Me.lblDOB = New System.Windows.Forms.Label
        Me.lblNumberOfHours = New System.Windows.Forms.Label
        Me.txtFirstName = New System.Windows.Forms.TextBox
        Me.txtLastName = New System.Windows.Forms.TextBox
        Me.txtAddress = New System.Windows.Forms.TextBox
        Me.txtCity = New System.Windows.Forms.TextBox
        Me.txtState = New System.Windows.Forms.TextBox
        Me.txtDOB = New System.Windows.Forms.TextBox
        Me.txtNumberOfHours = New System.Windows.Forms.TextBox
        Me.txtStudentNumber = New System.Windows.Forms.TextBox
        Me.btnCalculate = New System.Windows.Forms.Button
        Me.lblResults = New System.Windows.Forms.Label
        Me.lblTuitionCalculator = New System.Windows.Forms.Label
        Me.SuspendLayout()
        '
        'lblStudentNumber
        '
        Me.lblStudentNumber.Location = New System.Drawing.Point(16, 40)
        Me.lblStudentNumber.Name = "lblStudentNumber"
        Me.lblStudentNumber.Size = New System.Drawing.Size(88, 16)
        Me.lblStudentNumber.TabIndex = 0
        Me.lblStudentNumber.Text = "Student Number"
        '
        'lblFirstName
        '
        Me.lblFirstName.Location = New System.Drawing.Point(16, 64)
        Me.lblFirstName.Name = "lblFirstName"
        Me.lblFirstName.Size = New System.Drawing.Size(100, 16)
        Me.lblFirstName.TabIndex = 1
        Me.lblFirstName.Text = "First Name"
        '
        'lblLastName
        '
        Me.lblLastName.Location = New System.Drawing.Point(16, 88)
        Me.lblLastName.Name = "lblLastName"
        Me.lblLastName.Size = New System.Drawing.Size(104, 16)
        Me.lblLastName.TabIndex = 2
        Me.lblLastName.Text = "Last Name"
        '
        'lblAddress
        '
        Me.lblAddress.Location = New System.Drawing.Point(16, 112)
        Me.lblAddress.Name = "lblAddress"
        Me.lblAddress.Size = New System.Drawing.Size(104, 24)
        Me.lblAddress.TabIndex = 3
        Me.lblAddress.Text = "Address"
        '
        'lblCity
        '
        Me.lblCity.Location = New System.Drawing.Point(16, 144)
        Me.lblCity.Name = "lblCity"
        Me.lblCity.Size = New System.Drawing.Size(40, 23)
        Me.lblCity.TabIndex = 4
        Me.lblCity.Text = "City"
        '
        'lblState
        '
        Me.lblState.Location = New System.Drawing.Point(224, 144)
        Me.lblState.Name = "lblState"
        Me.lblState.Size = New System.Drawing.Size(40, 23)
        Me.lblState.TabIndex = 5
        Me.lblState.Text = "State"
        '
        'lblDOB
        '
        Me.lblDOB.Location = New System.Drawing.Point(16, 176)
        Me.lblDOB.Name = "lblDOB"
        Me.lblDOB.TabIndex = 6
        Me.lblDOB.Text = "Date Of Birth"
        '
        'lblNumberOfHours
        '
        Me.lblNumberOfHours.Location = New System.Drawing.Point(16, 208)
        Me.lblNumberOfHours.Name = "lblNumberOfHours"
        Me.lblNumberOfHours.TabIndex = 7
        Me.lblNumberOfHours.Text = "Number of Hours"
        '
        'txtFirstName
        '
        Me.txtFirstName.Location = New System.Drawing.Point(192, 64)
        Me.txtFirstName.Name = "txtFirstName"
        Me.txtFirstName.Size = New System.Drawing.Size(128, 20)
        Me.txtFirstName.TabIndex = 8
        Me.txtFirstName.Text = ""
        '
        'txtLastName
        '
        Me.txtLastName.Location = New System.Drawing.Point(192, 88)
        Me.txtLastName.Name = "txtLastName"
        Me.txtLastName.Size = New System.Drawing.Size(128, 20)
        Me.txtLastName.TabIndex = 9
        Me.txtLastName.Text = ""
        '
        'txtAddress
        '
        Me.txtAddress.Location = New System.Drawing.Point(192, 112)
        Me.txtAddress.Name = "txtAddress"
        Me.txtAddress.Size = New System.Drawing.Size(128, 20)
        Me.txtAddress.TabIndex = 10
        Me.txtAddress.Text = ""
        '
        'txtCity
        '
        Me.txtCity.Location = New System.Drawing.Point(64, 144)
        Me.txtCity.Name = "txtCity"
        Me.txtCity.Size = New System.Drawing.Size(144, 20)
        Me.txtCity.TabIndex = 11
        Me.txtCity.Text = ""
        '
        'txtState
        '
        Me.txtState.Location = New System.Drawing.Point(272, 144)
        Me.txtState.Name = "txtState"
        Me.txtState.Size = New System.Drawing.Size(48, 20)
        Me.txtState.TabIndex = 12
        Me.txtState.Text = ""
        '
        'txtDOB
        '
        Me.txtDOB.Location = New System.Drawing.Point(240, 176)
        Me.txtDOB.Name = "txtDOB"
        Me.txtDOB.Size = New System.Drawing.Size(80, 20)
        Me.txtDOB.TabIndex = 13
        Me.txtDOB.Text = ""
        '
        'txtNumberOfHours
        '
        Me.txtNumberOfHours.Location = New System.Drawing.Point(240, 208)
        Me.txtNumberOfHours.Name = "txtNumberOfHours"
        Me.txtNumberOfHours.Size = New System.Drawing.Size(80, 20)
        Me.txtNumberOfHours.TabIndex = 14
        Me.txtNumberOfHours.Text = ""
        '
        'txtStudentNumber
        '
        Me.txtStudentNumber.Location = New System.Drawing.Point(232, 40)
        Me.txtStudentNumber.Name = "txtStudentNumber"
        Me.txtStudentNumber.Size = New System.Drawing.Size(88, 20)
        Me.txtStudentNumber.TabIndex = 15
        Me.txtStudentNumber.Text = ""
        '
        'btnCalculate
        '
        Me.btnCalculate.Location = New System.Drawing.Point(128, 240)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(96, 32)
        Me.btnCalculate.TabIndex = 16
        Me.btnCalculate.Text = "Calculate Tuition"
        '
        'lblResults
        '
        Me.lblResults.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblResults.Location = New System.Drawing.Point(104, 280)
        Me.lblResults.Name = "lblResults"
        Me.lblResults.Size = New System.Drawing.Size(160, 16)
        Me.lblResults.TabIndex = 17
        Me.lblResults.Text = "Results/Error Label"
        Me.lblResults.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'lblTuitionCalculator
        '
        Me.lblTuitionCalculator.Font = New System.Drawing.Font("Arial", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblTuitionCalculator.Location = New System.Drawing.Point(40, 8)
        Me.lblTuitionCalculator.Name = "lblTuitionCalculator"
        Me.lblTuitionCalculator.Size = New System.Drawing.Size(240, 24)
        Me.lblTuitionCalculator.TabIndex = 18
        Me.lblTuitionCalculator.Text = "Tuition Calculator"
        Me.lblTuitionCalculator.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Form1
        '
        Me.AutoScaleBaseSize = New System.Drawing.Size(5, 13)
        Me.ClientSize = New System.Drawing.Size(368, 310)
        Me.Controls.Add(Me.lblTuitionCalculator)
        Me.Controls.Add(Me.lblResults)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.txtStudentNumber)
        Me.Controls.Add(Me.txtNumberOfHours)
        Me.Controls.Add(Me.txtDOB)
        Me.Controls.Add(Me.txtState)
        Me.Controls.Add(Me.txtCity)
        Me.Controls.Add(Me.txtAddress)
        Me.Controls.Add(Me.txtLastName)
        Me.Controls.Add(Me.txtFirstName)
        Me.Controls.Add(Me.lblNumberOfHours)
        Me.Controls.Add(Me.lblDOB)
        Me.Controls.Add(Me.lblState)
        Me.Controls.Add(Me.lblCity)
        Me.Controls.Add(Me.lblAddress)
        Me.Controls.Add(Me.lblLastName)
        Me.Controls.Add(Me.lblFirstName)
        Me.Controls.Add(Me.lblStudentNumber)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)

    End Sub

#End Region

End Class
