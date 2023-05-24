import requests
from bs4 import BeautifulSoup

headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome  /88.0.4324.182 Safari/537.36'
}

# product_url = 'https://www.flipkart.com/apple-iphone-14-pro-deep-purple-128-gb/p/itm75f73f63239fa'
product_url= 'https://www.flipkart.com/spigen-liquid-air-back-cover-apple-iphone-14-pro/p/itma907799be33df?pid=ACCGHRFYSZDJGS2M&lid=LSTACCGHRFYSZDJGS2MQBZMCU&marketplace=FLIPKART&fm=productRecommendation%2Fattach&iid=R%3Aa%3Bp%3AMOBGHWFHYGAZRWFT%3Bpt%3App%3Buid%3A5ebb7e84-fa35-11ed-ab31-cd1164d749b8%3B.ACCGHRFYSZDJGS2M&ppt=None&ppn=None&ssid=hylnrqvkkg0000001684934268515&otracker=pp_reco_Buy%2Btogether%2Band%2Bsave%2B30%2525%2Bmore_2_Buy%2Btogether%2Band%2Bsave%2B30%2525%2Bmore_ACCGHRFYSZDJGS2M_productRecommendation%2Fattach_2&otracker1=pp_reco_PINNED_productRecommendation%2Fattach_Buy%2Btogether%2Band%2Bsave%2B30%2525%2Bmore_NA_productCard_cc_2_NA_view-all&cid=ACCGHRFYSZDJGS2M'

def get_reviews(product_url):
    reviews = []
    response = requests.get(product_url, headers=headers)
    soup = BeautifulSoup(response.content, 'html.parser')

    review_containers = soup.find_all('div', {'class': '_1AtVbE'})

    for container in review_containers:
        divs = container.findAll('div', {'class': 't-ZTKy'})
        if(divs):
            for div in divs:
                reviews.append(div.text)

    return reviews


reviews = get_reviews(product_url)

for review in reviews:
    print(review)
    print('---')
    
    
 