# Cyber Security Training

### Course: [The Absolute Beginners Guide To Information Cyber Security](https://www.udemy.com/course/the-absolute-beginners-guide-to-information-cyber-security/)

### Author: [Alexander Oni](https://www.udemy.com/user/alexanderoni/)

---

<br>

## Table of contents

1. [General Introduction](#section1)

      1. [Information Security and Cyber Security](#info-cyber-security)

      2. [Fundamental Pillars](#pillars)

      3. [Basic Terminologies](#basic-terminologie)

      4. [Computer Protocols](#protocols)

2. [Hackers](#section2)

      1. [Type of Hackers](#types-of-hackers)

      2. [Hacker Methodology](#hacker-methodology)

      3. [ICANNWHOIS](#icannwhois)

      4. [Social Engineering](#social-eng)

3. [Attacks](#section3)

      1. [Brute Force](#brute-force)

      2. [Phishing](#phishing)

      3. [Bots and Botnets](#bots-and-botnets)

      4. [DoS and DDoS](#dos-and-ddos)

      5. [Man-In-The-Middle](#man-in-the-middle)

      6. [SQL Injection](#sql-injection)

      7. [Cross-site Scripting (XSS)](#cross-site-scripting)

4. [Malware](#section4)

      1. [Virus](#virus)

      2. [Worms](#worms)

      3. [Trojans](#trojans)

      4. [Adware & Spyware](#adware-spyware)

      5. [Ransomware](#ransomware)

      6. [Other Types of Malware](#other-types-of-malware)

5. [Defences](#section5)

      1. [Firewalls](#firewalls)

      2. [Encryption](#encryption)

      3. [Biometrics](#biometrics)

      4. [Antivirus](#antivirus)

      5. [Factor of Authentication](#factor-authentication)

      6. [Honeypots and DMZs](#honeypots-dmzs)

      7. [Passwords](#passwords)

6. [Security on the Workplace](#section6)

      1. [Security Policy](#security-policy)

      2. [BYOD Policy](#byod-policy)

      3. [Incident Response Plan](#incidente-response-plan)

      4. [Disaster Recovery Plan](#disaster-recovery-plan)

      5. [Ease of Access x Security](#ease-of-access-security)

7. [Cyber Warfare](#section7)

      1. [List of Cyber Warfare Attacks](#list-warfare)

8. [Bonus Section](#bonus)

      2. [List of movie suggestions](#list-movie)

<br>

<br>

## Section 1: General Introduction <a name="section1"></a>

<br>

### Information Security and Cyber Security: <a name="info-cyber-security"></a>
___
* Cyber Security deals with protect your data from cyber attacks

* Information Security deals with protect your data from physical attacks

<br>

### Fundamental Pillars: <a name="pillars"></a>
___
**Fundamental Pillars of Cybersecurity**

   1. **Confidentiality:** Data is accessed by only those with rhe right permit

   2. **Integrity:** Data has not been tampered or altered in any way

   3. **Availability:** Data and resources are available to be accessed or shared

**Fundamental Pillars of Cyber Crime**

1. **Disclosure:** Data is accessed by non-authorized users

2. **Alteration:** Data has been compromised or tampered

3. **Deniability:** Access to data and resources are blocked

<br>

### Basic Terminologies: <a name="basic-terminologie"></a>
___

Below are some of the main terminologies that you should be aware about in the world of computer and network security.

**Blacklist**: Used to refer to a list of banned IP addresses, applications or users.

**Whitelist**: The exact opposite of a blacklist

**Cat fishing**: The process of creating a fake online profile in order to trick people into believing they are someone else for financial gain.

**Authentication**: The process of proving an individual is who they claim to be.

**Data Mining**: The activity of analyzing and/or searching through data in order to find items of relevance, significance or value

**Threat**: This generally refers to anything that has the potential to cause our data, systems and networks harm.

**Exploit**: A clearly defined way to breach the security of a system.

**Vulnerabilities**: These are weaknesses within a system or network that can be exploited to cause us harm.

**Risk**: This refers to the likelihood of something bad happening. A risk requires both a threat and a vulnerability to exist.

**Zero Day**: This is used to describe a threat that is unknown to security specialists and has not been addressed.

**Hack Value**: This describes a target that may attract an above average level of attention from an attacker.

**Non-Repudiation**: This is the concept that once an action is carried out by a party it cannot be denied by that same party.

**Logic Bomb**: A malicious code that is only triggered when a set of conditions are met.

**Obfuscation**: A term used to describe the tactic of making code unclear so that humans or programs like an antivirus cannot understand it.

**Honey Pot**:  A decoy or trap for hackers

**Spoof**: The act of falsifying the identity of the source of a communication or interaction

**Cookies**: A cookie is a text file which is placed on your computer whenever you visit a website. This cookie allows the website to keep track of your visit details and store your preferences. The main objective here is to increase the speed with which you visit that same website again. At the same time, they are very useful for advertisers who can match the ads to your interests after they see your browsing history. 

<br>

### Computer Protocols: <a name="protocols"></a>
___

* A protocol is a set of rules that determine how computers communicate with each other

* Protcols also govern how an internet document get transmitted to a computer

* The protocol will determine what part of the conversation comes at which time and also how the conversation ends

**HTTPS & HTTPS**

* HTTP

      Determines how browsers and web servers communicate

* HTTPS

      Secure HTTP

The connection is dropped once the request has been made - "stateless system"

**SSL & SSH** 

>**_Note:_**  technicaly not protocols

* SSL - Secure Sockets Layer

      Used by HTTPS to provide encryption

* SSH - Secure Shell

      Used specifically by programmers and netword administrators

**FTP & SFTP**

* FTP - File Transfer Protocol

      How files are transmitted

* FTP - Secure File Transfer Protocol

      Provide security to FTP

**imap & SMTP**

* IMAP - Internet Acess Message Protocol

      How internet messages are sent 

* SMTP - Simple Mail Transfer Protocol 

      How email are sent and received

**TCP/IP**

* TCP - Transmission Control Protocol

      Divides a message or file into packets that are transmitted over the internet

* IP - Internet Protocol 

      Responsible for the addres of each packet

* 4 Layers of TCP/IP

   1. Datalink Layer - Consists of protocols that operate on a link that connects hosts on a network e.g. Ethernet

   2. Internet/Networking Layer - Connect independet networks together e.g. IP

   3. Transport Layer - Handlers communication between hosts e.g. TCP

   4. Application Layer - Standardizes data exchange for applications e.g. HTTP, FTP

<br>

<br>

## Section 2: Hackers <a name="section2"></a>

<br>

### Types of hackers: <a name="types-of-hackers"></a>

* Black Hat

      Very Skilled and with financial interests

* Grey Hat

      Very Skilled. Use Black Hat tactics for White Hat objectives

* Script Kiddie

      Unskilled

* Hacketivists

      Hacking for a cause

* **Disgruntled Employee**

      The name make obvious 

* Insider Threat

      Spy(?)/Saboteur

### Hacker Methodology: <a name="hacker-methodoly"></a>
___

>**_Note:_** There's not a standardized method

* Reconnaissance / Footprinting

      Gathering as much information about the target

* Exploitation 

      Taking advantage of a vulnerability 

* Privilege Escalation 

      Increasing the control over the exploited target

* Establish Persistence

      Ensuring continous access even after the breach/attack has been discovered by the victim

* Attach Phase

      Data extraction, data corruption, malware injection

* Avoiding Detection

      Takingg deliberate actions to obscure or suppress information

<br>

### ICANNWHOIS: <a name="icannwhois"></a>
___

[ICANN WHOIS](https://lookup.icann.org/en) (pronounced "eye-can who is") refers to the service provided by ICANN (Internet Corporation for Assigned Names and Numbers) that allows individuals to retrieve information about domain name registrations. WHOIS is a protocol used to query databases that store registration details for domain names.

<br>

### Social Engineering: <a name="social-eng"></a>
___

Social Engineering is the exploiting of human emotions and interactions to extract valuable information.

More dangerous than traditional methods of hacking. Relies on human error to work, wich is subjective and less predictable than software/hardware vulnerabilities.

**Tactics of Social Engineering**: <a name="social-eng-tatics"></a>

* Baiting

      Trying to lure the target to taking an unfavorable action

   
* Pretexting

      Looking, acting or sounding the parte. Relies on conviction and trust.

* Quid Pro Quo

      Offering a service in exchange for information

   >**_Tip:_** Search for [Kevin Mitnick](https://pt.wikipedia.org/wiki/Kevin_Mitnick) 

* Phising

      Relies on creating a sense of excitement or panic in the target using email

* Vishing

      Relies on creating a sense of excitement or panic in the target using phone call

* Lunchtime Attack

      Employee does not logoff before leaving the workstation for lunch

* Tailgating

      The attacker without access authorization closely follow an authorized person in a reserved area

* Piggy Backing

      The attacker enters a secure area with authorization of an employee

* Shoulder Surfing

      Obtaining sensitive information by spying

* Dumpster Diving

      Obtaining sensitive information by going through the company trash

<br>

<br>

## Section 3: Attacks <a name="section3"></a>

<br>

### Brute Force: <a name="brute-force"></a>
___

A trial and error attack against passwords, checking all possible key combinations. 

Automated software is used to generate a large number of consecutive guesses. Because of that is considered as an infallibile, but time consuming, method

Depends heavily on the key length and key possible characters

You can prevent Brute Force attacks with:

   * Strong passwords
   
   * Restricting the number of times a user can attempt to login

   * Enforcing a timeout for users who exceed the specified maximum of failed login attempts

<br>

### Phishing: <a name="phising"></a>
___

The attempt by a hacker to obtain sensitve data by sending crafted emails to a victim. The email contains a malicious link whick when clicked on can either install malware or redirect the victim to a fake website.

Phising relies on **Naivety**, **curiosity** and **fear**.

>**_Tip:_** You don't know if an email is, in fact, phishing? Try hovering your mouse over the links to look up the URL/Email and confirm if it's legit

**Types of Phishing**

* Classic/Email

      Spam emails with malicious link are sent in mass

* Spear

      Phishing attack directed ate a very specific target. More dangerous that classic
   
* Whaling

      Directed against senior executives.

* Vishing

      Phising attack with a phone call

* Smishing

      Phising attack with text message

You can prevent Phising attacks with:

   * Training

   * Security Alertness

   * Using anti-malware software

<br>

### Bots and Botnets: <a name="bots-and-botnets"></a>
___

Bots are a short name for Robots,commonly referred to as Zombies. 

An attacker gains complete control over the infected computer using a trojan horse, this can severly degrade the computers performance. 

A BotNet is a collection of bots, often useds to perfom DDoS attacks, and the person who is in control is called botmaster or bot herder. The botmaster use a **command and control** server to issue commands to the bots.

You can prevent Phising attacks with:

   * Updated antivirus and anti-malware products

   * Not falling into Phishing attacks

<br>

### DoS and DDoS: <a name="dos-and-ddos"></a>
___

DoS (Denial of Service) attacks involve overwhelming a system with excessive traffic or requests, making it inaccessible to legitimate users. The usually way to deal with this kind of attack is blocking the ip of the attacker.

DDoS (Distributed Denial of Service) attacks are similar but involve multiple sources generating the attack traffic, often using a network of compromised computers (botnet), amplifying the impact and making it harder to mitigate. You can prevent with overprovision bandwitdth, creating a DDoS playbook police and calling a DDoS specialist.

In such attacks useless amounts of traffic are sent to the targer server. A example of such traffic is the **Ping**, a network command that is used determine whether or not a particular server is online.

<br>

### Man-in-the-Middle: <a name="man-in-the-middle"></a>
___


A Man-in-the-Middle (MitM) attack is a type of cybersecurity attack where an attacker intercepts and potentially alters communications between two parties without their knowledge. In this attack, the attacker positions themselves between the sender and the receiver, intercepting and possibly modifying the data being exchanged.

This attack can only succeed when the attacker can impersonate both sides and is very common with unsecure wireless connections.

Took this conversation as an example:

Jim writes to his lover, Jessica, the following message:

      Jessica, i love you!

The man-in-the-middle intercepts and change the message to:

      Jessica, i hate you!

Jim now is single.

**Types of MITMAs**

* Email Hijacking - attacker gains access to email accounts

* Wifi Eavesdropping - hijacking wifi connection

* Session Hijacking - connection between a computer and a website

<br>

### SQL injection: <a name="sql-injection"></a>
___

>**_Check:_** [What is SQL?](https://pt.wikipedia.org/wiki/SQL)

The attacker will execute malicious SQL commands to corrupt a database. Can provide unauthorized acces to sensitive information, like passwords and usernames, or delete and modify data.

>**_Tip:_** [Havij - Advanced SQL Injection](https://pt.wikipedia.org/wiki/Havij_-_Advanced_SQL_Injection )

You can prevent SQL attacks with:

* Limiting databse privileges

* Comprehensive [Data Sanitization](https://www.datasanitization.org/data-sanitization-terminology/#:~:text=Data%20sanitization%20is%20the%20process,will%20not%20ever%20be%20recovered.)

* Applying software patches

<br>

### Cross-site Scripting (XSS) attack: <a name="cross-site-scripting"></a>
___

The attacker executes malicious scripts of code into a website or web application, this type of attack target not a directly victim, but the website that the victim would visit.

<br>

## Section 4: Malware <a name="section4"></a>

<br>

[Malware](https://www.paloaltonetworks.com/cyberpedia/what-is-malware#:~:text=Malware%20Definition,any%20behavior%20an%20attacker%20wants.) (short for “malicious software”) is a file or code, typically delivered over a network, that infects, explores, steals or conducts virtually any behavior an attacker wants.


### Virus: <a name="virus"></a>
___

Viruses are malicious code written to alter the way a computer or a network.

A **Virus** requires an active host program or an already infected system to run and cause damage by infecting other executable files or documents.

Viruses can vary widely in their objectives. For example, some can be purely destructive, such as destroying files, while others can slow down system performance or even have no impact at all.

**Stages of a Virus:**

1. Viruses typically attach themselves to executable files documents

2. They spread via email attachments, infected websites and flash drives

3. A virus will remain dormant until the infected file or system is activated

4. Once activated, the virus causes destruction

<br>

### Worms: <a name="worms"></a>
___

A **Worm** is a type of malware that is designed to replicate itself and spread across computer networks or systems without requiring user intervention. Unlike viruses, which typically attach themselves to files or programs, worms are standalone malicious programs that can propagate independently.

**Stages of a Worm**

1. Worms enter in the system via network connection or a downloaded file

2. They then make copies of themselves and can spread via a network/internet connection

**Fight Against Viruses and Worms:**

* Antivirus and antimalware products

* Restrict use of flash drivers

* Scan email attachments

### Trojans: <a name="trojans"></a>
___

A **Trojan** is a highly potent form of malware that frequently masquerades as legitimate software. It is a sophisticated type of malicious software that can be cleverly disguised as various file types, including songs, images, applications, or even games. One of the limitations of Trojans is that they lack the ability to self-replicate.

**Types of Trojans:**

* Backdoor Trojan:

      Allows access of a unauthorized hacker to a system in order to control it

* Infostealer Trojan:

      Steals data from the infected computer

* Trojan Downloader 

      Can download and install new versions of malware onto a system

* Trojan DDoS 

      Can conduct DoS attacks against websites

**Fight Against Trojans**

* Use antimalware products

* Run updates when avaible

* Download files from only trusted websites

### Adware & Spyware: <a name="adware-spyware"></a>
___

**Adware** refers to programs that display unwanted banner advertisements, often bundled with software installations. One of the primary motivations behind including **adware** is to recover the development costs of a free application.

Some **adware** can be more malicious, encompassing activities ranging from hijacking computer start pages to tracking and collecting your personal data.

**Spyware** monitor computer and internet use with, for example, Keyloggers that can record keystrokes or take screenshots. Then they sent the data to hackers or advertising agencies.

**Fight against AD/SPYware:**

* Use spyware scanners

* Think twice about installing free software

### Ransomware: <a name="ransomware"></a>
___

Ransomware is a type of malicious software (malware) designed to encrypt files or lock computer systems, holding them hostage until a ransom is paid. Once infected, ransomware encrypts the victim's files, making them inaccessible, and typically displays a ransom note instructing the victim on how to pay the ransom to obtain a decryption key.

>**_Tip:_** In must cases paying the hacker is the right choice. 

In certain scenarios the hacker can treaten to release the sensitive data of the victim, or in case of companys, releasing the information about clients or customers of the victim.

>**_Check:_** [Canon Ransomware Case](https://www.tecmundo.com.br/seguranca/207491-canon-confirma-publicamente-teve-dados-roubados-ransomware.htm) 

### Other Types of Malware: <a name="other-types-of-malware"></a>
___

**Rootkits:** A rootkit is a type of malicious software that allows unauthorized control over a computer or system. It hides its presence, making it difficult to detect and remove while enabling the attacker to gain privileged access and perform malicious activities. A recommended solution will be to just wipe out the hard drive.

**Browser Hijack**: Refers to unauthorized changes made to a web browser's settings, typically by malware or malicious websites. It alters the homepage, search engine, or other browser settings without the user's permission, potentially leading to unwanted redirects, advertisements, or changes in browsing behavior.

**Rogue security:** Also known as rogue antivirus or scareware, is a type of malicious software that deceptively claims to provide security protection while actually causing harm to a computer system. It tricks users into believing their system is infected with viruses or other threats and prompts them to purchase or download fake security software.

<br>

## Section 5: Defences <a name="section5"></a>

<br>

### Firewalls: <a name="firewalls"></a>
___

A **Firewall** is a security device that monitors incoming and outgoing network traffic. Acts like a gateway to make sure that all in and out data are safe. 

A firewall can prevent employees from sending certain data outside of the network or access to certain websites.

**How Firewall work?**

* Packet Filtering
      
      Checks all the data passing through using a filter

* Proxy Service 

      The firewall acts as an intermediary between systems

* Stateful Inspection

      Tracks the state of a connection between systems

**Types of Firewall**

* Hardware 

      Can be standalone or built into network devices like switches and routers

* Software

      Either a standalone application or part of a scurity application like anti-virus 


### Encryption: <a name="encryption"></a>
___

**Encryption** is a process of making information hidden or secretive using keys (cipher). Then the user can unlock the cipher also using a key, with is called **Decryption**.

**Types of Encryption:**

* Asymmetric
      
      Uses two different keys for encrypting and decrypting. Example: RSA

* Symmetric

      Use just one key. Examples: Data Encryption Standard (DES) and Advanced Encryption Standard (AES) 

### Biometrics: <a name="biometrics"></a>
___

A security mechanism used to authenticate and provide access based on the verification of physical characteristics. The database stores the biometric data for comparison.

**Types of Biometric Identifiers:**

* Physiological Characteristics
      
      The shape or composition of the body like fingerprints, dna, retina, face and hand

* Behavioral Characteristics

      The behavior of a person. Voice, gesture ... 

### Antivirus: <a name="antivirus"></a>
___

A antivirus is used to protect a computer from malware. There are two main ways that a antivirus can use to identify a virus. First is signature, i.e pattern of data or behaviour that is known to be related to already identified malware. The other way is the Heuristic Method i.e predicting if a file is malicious by studying its behavior.

>**_Note:_** A Heuristic can result in a false positive, but pay attention because is not that common

### Factor Authentication Methods: <a name="factor-authentication"></a>
___

Factor Authentication is a security measure that adds an extra layer of protection to verify the identity of a user during the login process. It requires users to provide more than one type of credentials to gain access to an account or system.

Its important to say that two credentials of the same category dont constitute a multi-factor authentication, like a username and password (both being Knowledge Factor). The user have to provide at least two types of factors, some examples:

* **Knowledge Factor**

      Something that the user knows, like a password

* **Possession Factor**

      Something that the user has, like a token or mobile device

* **Inherence Factor**

      Something that the user is, like biometrics


### Honeypots and Delimitrized Zone(DMZs): <a name="honeypots-dmzs"></a>
___

Honey is a computer system that is used as a decoy to lure cybercriminals. Its also used to study attempts to gain unauthorized access.

DZM is a physical or logical subnetwork that separates a local area network from other untrusted networks. External facing servers and resources are placed in the DMZ so they are accessible from the internet but the internal LAN is kept off limits.


**Types os Honeypots:**

* Research Honeypots
      
      Run to enable close analysis of how attackes develop and progres in order to learn how to protect systems against them.

* Production Honeypots

      Placed insed in a production netword with other real server to act as decoy. They are designed to appear real, the objective is keep the hackers distrcted while the real production servers are patched up.

### Passwords: <a name="passwords"></a>
___

A password is a string of characters, typically a combination of letters, numbers, and symbols, used to authenticate or verify the identity of a user. It is usually a shorter sequence and is commonly used to protect digital accounts, such as email, social media, or online banking.

On the other hand, a passphrase is a longer and more complex sequence of words, phrases, or sentences used for the same purpose as a password. Passphrases tend to be easier to remember because they can be made up of multiple words or a combination of words and symbols. They are considered more secure than passwords because of their length and complexity. Passphrases are commonly used in encryption systems or to secure sensitive information.

The main difference between a password and a passphrase is the length and complexity. Passwords are typically shorter and consist of a combination of characters, while passphrases are longer and can include multiple words or phrases. Passphrases offer increased security but may be more challenging to enter correctly.
 

**Create a strong password:**

* At least 8-12 characters 

* Contain both numbers and letters

* at least one CAPITAL letter

* at least one symbol

* dont use the same passwords for all accounts


>**_Tip:_** if you use passphrase, make sure that it contains all strong password recomendations

>**_Tip2:_** Use unique passwords for important accounts, reuse if its not the case


<br>

## Section 6: Cyber Security on the Workplace <a name="section6"></a>

<br>

### Security Policy: <a name="security-policy"></a>
___
 
This is a written document that describes how an organization protects its virtual and physical data assets from threats. 

* What assets need to be protected?

* Whats data can employees access?

* How can they access the data?

* Can employees use USB drives? Access the internet freely?

* How often are passwords changed?

### Bring You Own Device(BYOD) Policy: <a name="byod-policy"></a>
___

BYOD policy refers to a set of rules and guidelines established by an organization to govern the use of personal devices, such as smartphones, tablets, and laptops, for work purposes.

The BYOD policy outlines the terms and conditions under which employees can use their personal devices to access company resources, applications, and data. It typically addresses aspects such as device eligibility, security requirements, data protection, user responsibilities, and support provisions.

**Sample BYOD Policy:**

* Must address both the concerns of the company and the employees

* Must aim for a balance between security and ease of access

>**_Tipe:_** Start with the basics

* Determine what devices will be permitted and who will be allowed to use them

* Determine the kind of company data that will be accessible

* Clearly state the right of the company to access, monitor and delete information from the employee owned devices

* Explain how the company will protect the employees personal data 

* Deploy mobile device management to partition the devices separating work data from personal file

* Enforce use of strong passwords, antimalware and automatic lockup after periods of inactivity

* Establish protocols for lost or stolen devices

* Develop the policy in partnership with IT, Risk Management and Legal Counsel 

* Revise current policies and protocols

### Incidente Response Plan: <a name="incidente-response-plan"></a>
___

A set of policies and procedures that are used to identify, contain and eliminate cyberattacks. The goial is to allow and organization to quickly  detect and stop attacks and prevent furutre attacks of the same type.

### Disaster Recovery Plan: <a name="disaster-recovery-plan"></a>
___

The plan that focuses on the restoration of critical systems after a disaster. But what is a disaster? Fire, earthquake or even a very serious cyber attack

### Ease of Access x Security Paradox: <a name="ease-of-access-security"></a>
___

The Ease of Access x Security paradox refers to the challenge of finding the right balance between user-friendly access and strong system security. Increasing security measures can impact user-friendliness, while prioritizing ease of access may compromise security. Striking the right balance requires careful consideration and risk management. Organizations need to ensure that users can easily navigate and interact with the system while implementing measures to protect against unauthorized access and data breaches. It is a challenging dilemma that necessitates iterative improvements and continuous adaptation to meet user needs while safeguarding the system against potential threats.

<br>

## Section 7: Cyber Warfare <a name="section7"></a>

Cyber warfare refers to the use of digital technologies, such as computer systems, networks, and the internet, to conduct offensive or defensive operations against other nations, organizations, or individuals. It involves the deliberate exploitation of vulnerabilities in computer systems, networks, or information infrastructures to disrupt, damage, or gain unauthorized access to critical systems, data, or communication channels.

### List of Cyber Warfare Attacks: <a name="list-warfare"></a>
___

* [2007 cyberattack on Estonia](https://en.wikipedia.org/wiki/2007_cyberattacks_on_Estonia)

* [STUxNet in Iran](https://pt.wikipedia.org/wiki/Stuxnet)

* [Colonial Pipeline Ransomware](https://www.techtarget.com/whatis/feature/Colonial-Pipeline-hack-explained-Everything-you-need-to-know)

* [Sony Hack](https://en.wikipedia.org/wiki/Sony_Pictures_hack)

<br>

## Bonus Section <a name="bonus"></a>

<br>

### List Of Movie Suggestions: <a name="list-movie"></a>
___

* Swordfish - 2001

* James Bond: Diamonds Are Forever - 1971

* Catch Me If You Can - 2002

* Sneakers - 1992

* Troy - 2004

* Matrix - 1999

* Mission Impossible 5 - 2015

* Mission Impossible -  1996

* The Interview - 2015