---


---

<h2 id="week-1-object-oriented-programming-basics-java">Week 1: Object-Oriented Programming Basics (Java)</h2>
<h3 id="learning-objectives">Learning Objectives</h3>
<p>By the end of this week, learners will be able to:</p>
<ul>
<li>
<p>Grasp the principles of Object-Oriented Programming (OOP)</p>
</li>
<li>
<p>Apply real-world financial logic using Java classes and objects</p>
</li>
<li>
<p>Construct reusable financial components using constructors and the <code>this</code> keyword</p>
</li>
<li>
<p>Structure applications using object methods and encapsulation</p>
</li>
</ul>
<hr>
<h3 id="day-by-day-plan">Day-by-Day Plan</h3>
<h4 id="day-1-oop-in-financial-systems">Day 1: OOP in Financial Systems</h4>
<p><strong>Topics:</strong></p>
<ul>
<li>
<p>Core OOP principles: Abstraction, Encapsulation, Inheritance, Polymorphism</p>
</li>
<li>
<p>Classes vs Objects</p>
</li>
<li>
<p>Real-world financial analogies (Class = BankAccount blueprint, Object = your actual savings account)</p>
</li>
</ul>
<p><strong>Code Example:</strong></p>
<pre><code>class BankAccount {
    private String accountHolder;
    private double balance;

    public void setDetails(String name, double bal) {
        this.accountHolder = name;
        this.balance = bal;
    }

    public void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setDetails("Ravi", 12000);
        acc.showBalance();
    }
}
</code></pre>
<p><strong>Classroom Activity:</strong></p>
<ul>
<li>Create a <code>DigitalWallet</code> class with private fields <code>ownerName</code>, <code>amount</code>, and a method <code>checkBalance()</code>.</li>
</ul>
<hr>
<h4 id="day-2-constructors-encapsulation--this-keyword">Day 2: Constructors, Encapsulation &amp; <code>this</code> Keyword</h4>
<p><strong>Topics:</strong></p>
<ul>
<li>
<p>Constructors (default &amp; parameterized)</p>
</li>
<li>
<p><code>this</code> keyword</p>
</li>
<li>
<p>Benefits of encapsulation in financial applications</p>
</li>
</ul>
<p><strong>Code Example:</strong></p>
<pre><code>class LoanAccount {
    private String loanType;
    private double amount;

    LoanAccount(String loanType, double amount) {
        this.loanType = loanType;
        this.amount = amount;
    }

    public void displayDetails() {
        System.out.println("Loan Type: " + loanType);
        System.out.println("Amount: ₹" + amount);
    }
}
</code></pre>
<p><strong>Task:</strong></p>
<ul>
<li>Create a <code>FixedDeposit</code> class with <code>name</code>, <code>principalAmount</code>, and <code>durationInYears</code>. Include a parameterized constructor and a <code>display()</code> method.</li>
</ul>
<hr>
<h4 id="day-3-methods-and-return-values">Day 3: Methods and Return Values</h4>
<p><strong>Topics:</strong></p>
<ul>
<li>
<p>Writing financial calculation methods</p>
</li>
<li>
<p>Understanding method parameters &amp; return types</p>
</li>
<li>
<p>Basic math in Java</p>
</li>
</ul>
<p><strong>Code Example:</strong></p>
<pre><code>class EMICalculator {
    public double calculateEMI(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        EMICalculator emi = new EMICalculator();
        double result = emi.calculateEMI(100000, 10, 2);
        System.out.println("Calculated EMI: ₹" + result);
    }
}
</code></pre>
<p><strong>Mini Challenge:</strong></p>
<ul>
<li>
<p>Create a <code>CurrencyConverter</code> class with methods:</p>
<ul>
<li>
<p><code>toINR(double usd)</code></p>
</li>
<li>
<p><code>toUSD(double inr)</code></p>
</li>
<li>
<p>Assume USD to INR = 83</p>
</li>
</ul>
</li>
</ul>
<hr>
<h4 id="day-4-hands-on-coding-challenge">Day 4: Hands-On Coding Challenge</h4>
<p><strong>Task:</strong> Create a fully functional <code>BankAccount</code> class with:</p>
<ul>
<li>
<p>Fields: <code>accountNumber</code>, <code>accountHolder</code>, <code>balance</code></p>
</li>
<li>
<p>Methods: <code>deposit(double amount)</code>, <code>withdraw(double amount)</code>, <code>printDetails()</code></p>
</li>
<li>
<p>Prevent overdraft (balance should not go negative)</p>
</li>
</ul>
<p><strong>Expected Output:</strong></p>
<pre><code>Account Holder: Aditi
Account Number: 123456
Balance: ₹5000.0
</code></pre>
<hr>
<h4 id="day-5-quiz--review--assignment">Day 5: Quiz + Review + Assignment</h4>
<p><strong>MCQs:</strong></p>
<ol>
<li>
<p>What is the benefit of using constructors?</p>
</li>
<li>
<p>What does the <code>this</code> keyword refer to?</p>
</li>
<li>
<p>What is method overloading and is it supported in Java?</p>
</li>
<li>
<p>What access modifier is best used for encapsulation?</p>
</li>
</ol>
<p><strong>Assignment:</strong> Build a <code>Transaction</code> class:</p>
<ul>
<li>
<p>Fields: <code>amount</code>, <code>type</code> (“credit” or “debit”), <code>timestamp</code></p>
</li>
<li>
<p>Use <code>java.time.LocalDateTime</code> for timestamp</p>
</li>
<li>
<p>Constructor &amp; <code>displayTransaction()</code> method</p>
</li>
<li>
<p><code>main()</code> method to create and display 3 transactions</p>
</li>
</ul>
<hr>
<h3 id="bonus-assessment--evaluation">Bonus: Assessment &amp; Evaluation</h3>
<p><strong>Marks Distribution:</strong></p>
<ul>
<li>
<p>10 points - BankAccount class (encapsulation, logic)</p>
</li>
<li>
<p>10 points - Transaction class (constructor, timestamp handling)</p>
</li>
<li>
<p>10 points - Quiz (MCQs + 1 coding snippet)</p>
</li>
</ul>
<p><strong>Submission Method:</strong></p>
<ul>
<li>
<p>Upload <code>.java</code> files or GitHub repo link</p>
</li>
<li>
<p>Optional: Submit a 2-3 minute video explaining your code and logic</p>
</li>
</ul>

