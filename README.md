# AgreementMaker
This customized tool is designed to generate the wordings for an annex of a purchase contract. The wordings contain invoice numbers, discounts descriptions and their amounts, numbers of purchase orders which the discounts are applied to.

Input: *.pdf file(s) - invoice(s)

Output: *.txt file with list of wordings

The tool checks input file(s) for discounts availability, searches for purchase orders which the discounts are applied to, gets discount description from database on the basis of discount code taken from invoice. Generates final wording containing current invoice number and its date, each discount code with its description and list of the purchase orders with current discount value.

Test files: 

InvoiceExample.pdf
InvoiceExapmleNoDiscounts.pdf
