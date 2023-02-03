let p = fetch(
  "https://cryptocapitalmodel.onrender.com/crypto/pastData?currency=ETH-USD"
);

p.then((response) => {
  console.log(response.status),
    console.log(response.ok),
    console.log(response.json());
}).then((data) => {
  console.log(data);
});
