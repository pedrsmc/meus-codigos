import Slider from '@react-native-community/slider';
import { Text, StyleSheet, View, Image, TouchableOpacity, Modal } from 'react-native';
import ModalContent from './src/components/modal';
import { useState } from 'react';


export default function App() {
  let chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#*."

  const [ModalOn, setModalOn] = useState(true)
  const [size, setSize] = useState(6)
  const [newPassword, setNewPassword] = useState("")

  function generatePassword() {
    let password = ""

    for (let i = 0; n = chars.length, i < size; i++) {
      password += chars.charAt(Math.floor(Math.random() * n))
    }

    setNewPassword(password)
    setModalOn(true)
  }

  return (
    <View style={styles.container}>
      <View style={styles.mainBox}>
        <Image
          style={styles.img}
          source={require('./src/assets/logo.png')}
        />
        <View style={styles.sliderField}>

          <Slider
            style={{ width: '100%', marginTop: 10 }}
            minimumValue={6}
            maximumValue={24}
            value={size}
            onValueChange={(number) => setSize(number.toFixed(0))}
            minimumTrackTintColor="#1258DC"
            thumbTintColor="#1258DC">
          </Slider>

          <Text style={{ fontSize: 15, fontWeight: '500' }}>{size} caracteres</Text>
        </View>
        <View>
          <TouchableOpacity style={styles.button} onPress={generatePassword}>
            <Text style={{ fontWeight: '600', fontSize: 20, color: '#fff' }}>Gerar senha</Text>
          </TouchableOpacity>
        </View>
        <Modal visible={ModalOn} animationType='fade' transparent={true}>
          <ModalContent password={newPassword} close={() => setModalOn(false)} />
        </Modal>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },


  mainBox: {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
  },

  img: {
    width: 250,
    height: 250,
  },

  sliderField: {
    marginTop: 30,
    display: 'flex',
    alignItems: 'center',
    gap: 10,
    width: 270,
    padding: 10,
    borderRadius: 10,
    borderWidth: 1,
    borderColor: '#dddd',
  },

  button: {
    marginTop: 50,
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#0A337F',
    width: 200,
    height: 50,
    borderRadius: 10,
  },
});
